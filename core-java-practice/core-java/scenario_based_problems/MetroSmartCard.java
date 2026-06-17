import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial smart card balance: ");
        int balance = sc.nextInt();

        while (true) {

            System.out.print("\nEnter distance travelled (km): ");
            int distance = sc.nextInt();

            int fare = (distance <= 5) ? 10
                    : (distance <= 15) ? 20
                    : 30;

            if (balance < fare) {
                System.out.println("Insufficient balance!");
                break;
            }

            balance -= fare;

            System.out.println("Fare Deducted: ₹" + fare);
            System.out.println("Remaining Balance: ₹" + balance);

            if (balance == 0) {
                System.out.println("Balance exhausted!");
                break;
            }

            System.out.print("Press Y to continue or N to quit: ");
            char choice = sc.next().charAt(0);

            if (choice == 'N' || choice == 'n') {
                System.out.println("Thank you for using Metro Smart Card.");
                break;
            }
        }

        sc.close();
    }
}