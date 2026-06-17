import java.util.Scanner;

public class RestaurantBillingSystem {

    // Food Cost
    public static double calculateFoodCost(double price, int quantity) {

        return price * quantity;
    }

    // GST Calculation
    public static double calculateGST(double amount) {

        return amount * 0.05;
    }

    // Discount Calculation
    public static double calculateDiscount(double amount) {

        if (amount > 1000) {
            return amount * 0.10;
        }

        return 0;
    }

    // Final Bill
    public static double generateFinalBill(double amount,
                                           double gst,
                                           double discount) {

        return amount + gst - discount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter food price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double foodCost = calculateFoodCost(price, quantity);

        double gst = calculateGST(foodCost);

        double discount = calculateDiscount(foodCost);

        double finalBill =
                generateFinalBill(foodCost, gst, discount);

        System.out.println("\nFood Cost: ₹" + foodCost);
        System.out.println("GST: ₹" + gst);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Payable Amount: ₹" + finalBill);

        sc.close();
    }
}