import java.util.Scanner;

public class CinemaSeatAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of seats: ");
        int n = sc.nextInt();

        int[] seats = new int[n];

        System.out.println("Enter seat status (0 = Empty, 1 = Booked):");

        for (int i = 0; i < n; i++) {
            seats[i] = sc.nextInt();
        }

        int booked = 0;
        int available = 0;

        int currentStart = -1;
        int currentLength = 0;

        int maxStart = -1;
        int maxEnd = -1;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {

            if (seats[i] == 1) {

                booked++;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxStart = currentStart;
                    maxEnd = i - 1;
                }

                currentLength = 0;

            } else {

                available++;

                if (currentLength == 0) {
                    currentStart = i;
                }

                currentLength++;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxStart = currentStart;
            maxEnd = n - 1;
        }

        System.out.println("Longest Available Block:");
        System.out.println("Start Position: " + maxStart);
        System.out.println("End Position: " + maxEnd);

        System.out.println("Booked Seats: " + booked);
        System.out.println("Available Seats: " + available);

        if (maxLength >= 5) {
            System.out.println("A group of 5 people can sit together.");
        } else {
            System.out.println("A group of 5 people cannot sit together.");
        }

        sc.close();
    }
}