import java.util.Scanner;

// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    // Payment Method
    public static void processPayment(double billAmount, double payment)
            throws InsufficientFundsException {

        if (payment < billAmount) {
            throw new InsufficientFundsException(
                    "Payment failed! Insufficient funds.");
        }

        System.out.println("Payment Successful!");
        System.out.println("Balance Returned: ₹" + (payment - billAmount));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] patients = {
                "Aman",
                "Riya",
                "Karan"
        };

        try {

            // NumberFormatException
            System.out.print("Enter total bill amount: ");
            double bill = Double.parseDouble(sc.nextLine());

            System.out.print("Enter number of items in bill: ");
            int items = Integer.parseInt(sc.nextLine());

            // ArithmeticException
            double avgCost = bill / items;
            System.out.println("Average Cost Per Item: ₹" + avgCost);

            // ArrayIndexOutOfBoundsException
            System.out.print("Enter patient index (0-2): ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Patient Name: " + patients[index]);

            // Custom Exception
            System.out.print("Enter payment amount: ");
            double payment = Double.parseDouble(sc.nextLine());

            processPayment(bill, payment);

        } catch (ArithmeticException e) {
            System.out.println("Error: Bill cannot have zero items.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric input.");

        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());

        } finally {
            System.out.println("Billing process completed.");
            sc.close();
        }
    }
}