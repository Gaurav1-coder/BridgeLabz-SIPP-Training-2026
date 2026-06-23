import java.io.*;

public class SchoolResultPortal {
    public static void main(String[] args) {

        String inputFile = "students.txt";
        String outputFile = "reportcard.txt";

        try (
                BufferedReader br = new BufferedReader(
                        new FileReader(inputFile));

                // true => append mode
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter(outputFile, true))
        ) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];

                int total = 0;

                for (int i = 1; i < data.length; i++) {
                    total += Integer.parseInt(data[i]);
                }

                double average =
                        (double) total / (data.length - 1);

                bw.write("Student: " + name);
                bw.newLine();

                bw.write("Average Marks: "
                        + String.format("%.2f", average));
                bw.newLine();

                bw.write("---------------------------");
                bw.newLine();
            }

            System.out.println(
                    "Report Card Generated Successfully.");

        } catch (FileNotFoundException e) {

            System.out.println(
                    "Error: Student file not found.");

        } catch (IOException e) {

            System.out.println(
                    "Error while reading/writing file.");

            e.printStackTrace();
        }
    }
}