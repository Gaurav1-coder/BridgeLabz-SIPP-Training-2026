import java.io.*;

public class StudentGradeManager {

    static String[] names = new String[100];
    static int[] totals = new int[100];
    static double[] averages = new double[100];
    static String[] grades = new String[100];
    static int studentCount = 0;

    // Calculate Grade
    public static String calculateGrade(double avg) {

        if (avg >= 90)
            return "A+";
        else if (avg >= 80)
            return "A";
        else if (avg >= 70)
            return "B";
        else if (avg >= 60)
            return "C";
        else
            return "F";
    }

    // Read Student Data
    public static void readStudents(String fileName) {

        try (BufferedReader br =
                     new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                names[studentCount] = data[0];

                int total = 0;

                for (int i = 1; i <= 5; i++) {
                    total += Integer.parseInt(data[i]);
                }

                totals[studentCount] = total;
                averages[studentCount] = total / 5.0;
                grades[studentCount] =
                        calculateGrade(averages[studentCount]);

                studentCount++;
            }

        } catch (FileNotFoundException e) {

            System.out.println(
                    "Error: Student file not found.");

        } catch (IOException e) {

            System.out.println(
                    "Error while reading file.");
        }
    }

    // Search Student
    public static void searchStudent(String name) {

        boolean found = false;

        for (int i = 0; i < studentCount; i++) {

            if (names[i].equalsIgnoreCase(name)) {

                System.out.println("\nStudent Found");
                System.out.println("Name: " + names[i]);
                System.out.println("Total: " + totals[i]);
                System.out.println("Average: " + averages[i]);
                System.out.println("Grade: " + grades[i]);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found");
        }
    }

    // Bubble Sort by Total Marks
    public static void sortStudents() {

        for (int i = 0; i < studentCount - 1; i++) {

            for (int j = 0; j < studentCount - i - 1; j++) {

                if (totals[j] < totals[j + 1]) {

                    int tempTotal = totals[j];
                    totals[j] = totals[j + 1];
                    totals[j + 1] = tempTotal;

                    double tempAvg = averages[j];
                    averages[j] = averages[j + 1];
                    averages[j + 1] = tempAvg;

                    String tempGrade = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = tempGrade;

                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
    }

    // Write Report
    public static void writeReport(String outputFile) {

        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter(outputFile))) {

            bw.write("===== STUDENT REPORT =====");
            bw.newLine();

            for (int i = 0; i < studentCount; i++) {

                bw.write("Name: " + names[i]);
                bw.newLine();

                bw.write("Total Marks: " + totals[i]);
                bw.newLine();

                bw.write("Average: "
                        + String.format("%.2f", averages[i]));
                bw.newLine();

                bw.write("Grade: " + grades[i]);
                bw.newLine();

                bw.write("------------------------");
                bw.newLine();
            }

            System.out.println(
                    "Report Generated Successfully.");

        } catch (IOException e) {

            System.out.println(
                    "Error while writing report.");
        }
    }

    public static void main(String[] args) {

        readStudents("students.txt");

        searchStudent("Deepika");

        sortStudents();

        writeReport("report.txt");
    }
}