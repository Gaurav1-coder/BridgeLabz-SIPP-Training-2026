import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter age (-1 to exit): ");
            int age = sc.nextInt();

            if (age == -1) {
                break;
            }

            if (age >= 18) {

                System.out.println("Eligible to vote");

                System.out.println("1. Candidate A");
                System.out.println("2. Candidate B");
                System.out.println("3. Candidate C");

                System.out.print("Enter your vote: ");
                int vote = sc.nextInt();

                switch (vote) {

                    case 1:
                        System.out.println("Voted for Candidate A");
                        break;

                    case 2:
                        System.out.println("Voted for Candidate B");
                        break;

                    case 3:
                        System.out.println("Voted for Candidate C");
                        break;

                    default:
                        System.out.println("Invalid Vote");
                }

            } else {

                System.out.println("Not eligible to vote");
            }
        }

        System.out.println("Polling Closed");

        sc.close();
    }
}