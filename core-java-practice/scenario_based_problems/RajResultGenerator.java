import java.util.Scanner;

public class RajResultGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        System.out.println("Enter marks of 5 subjects:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        double average = total / 5.0;

        int gradeCategory = (int) average / 10;

        System.out.println("\nAverage Marks: " + average);

        switch (gradeCategory) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;

            case 8:
                System.out.println("Grade: B");
                break;

            case 7:
                System.out.println("Grade: C");
                break;

            case 6:
                System.out.println("Grade: D");
                break;

            default:
                System.out.println("Grade: F");
        }

    }
}