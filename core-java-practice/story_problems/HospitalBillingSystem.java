import java.util.Scanner;

class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {
    public static void processPayment(double billAmount, double paidAmount)
            throws InsufficientFundsException {

        if (paidAmount < billAmount) {
            throw new InsufficientFundsException(
                    "Payment Failed! Insufficient Funds.");
        }

        System.out.println("Payment Successful.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {

            int totalBill = 5000;
            int items = 0;

            int costPerItem = totalBill / items;

            System.out.println("Cost Per Item: " + costPerItem);

        } catch (ArithmeticException e) {

            System.out.println(
                    "Error: Number of bill items cannot be zero.");
        }
        try {

            String[] patients = {
                    "Aman",
                    "Deepika",
                    "Riya"
            };

            int patientIndex = 5;

            System.out.println(
                    "Patient: " + patients[patientIndex]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Error: Invalid Patient Index.");
        }

        try {

            String ageInput = "abc";

            int age = Integer.parseInt(ageInput);

            System.out.println("Age: " + age);

        } catch (NumberFormatException e) {

            System.out.println(
                    "Error: Please enter a valid numeric value.");
        }

        try {

            double billAmount = 5000;
            double paidAmount = 3000;

            processPayment(billAmount, paidAmount);

        } catch (InsufficientFundsException e) {

            System.out.println(e.getMessage());
        }
    }
}