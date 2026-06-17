import java.util.Scanner;

public class ElectricityBillCalculator {

    // Accept units
    public static int getUnits() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        return sc.nextInt();
    }

    // Calculate bill
    public static double calculateBill(int units) {

        return units * 8.5; // ₹8.5 per unit
    }

    // Display details
    public static void displayBill(int units, double bill) {

        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Units Consumed: " + units);
        System.out.println("Bill Amount: ₹" + bill);
    }

    public static void main(String[] args) {

        int units = getUnits();

        double bill = calculateBill(units);

        displayBill(units, bill);
    }
}