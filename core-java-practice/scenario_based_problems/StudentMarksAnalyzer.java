import java.util.Scanner;

public class StudentMarksAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int countAbove75 = 0;
        int sum = 0;

        System.out.println("Enter marks:");

        for (int i = 0; i < n; i++) {

            marks[i] = sc.nextInt();

            highest = Math.max(highest, marks[i]);
            lowest = Math.min(lowest, marks[i]);

            if (marks[i] > 75) {
                countAbove75++;
            }

            sum += marks[i];
        }

        double average = (double) sum / n;

        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
        System.out.println("Students Above 75: " + countAbove75);
        System.out.println("Average Marks: " + average);

        System.out.println("Marks Greater Than Average:");

        for (int mark : marks) {

            if (mark > average) {
                System.out.print(mark + " ");
            }
        }

        sc.close();
    }
}