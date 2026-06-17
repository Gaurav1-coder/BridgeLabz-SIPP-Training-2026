import java.util.Scanner;

public class WarehouseStockRecoverySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int[] stock = new int[n];

        int zeroIndex = -1;
        int sum = 0;
        int count = 0;

        System.out.println("Enter stock quantities:");

        for (int i = 0; i < n; i++) {

            stock[i] = sc.nextInt();

            if (stock[i] == 0) {
                zeroIndex = i;
            } else {
                sum += stock[i];
                count++;
            }
        }

        int averageStock = sum / count;

        stock[zeroIndex] = averageStock;

        System.out.println("Missing Stock Position: " + zeroIndex);

        System.out.println("Updated Inventory:");

        for (int value : stock) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}