import java.util.Scanner;

public class KingdomTaxSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] incomes = new double[10];
        double totalTax = 0;

        for (int i = 0; i < incomes.length; i++) {
            System.out.print("Enter income of citizen " + (i + 1) + ": ");
            incomes[i] = sc.nextDouble();
        }

        System.out.println("\nTax Details:");

        for (int i = 0; i < incomes.length; i++) {
            double tax = 0;
            String bracket;

            if (incomes[i] < 10000) {
                bracket = "5%";
                tax = incomes[i] * 0.05;
            } else if (incomes[i] <= 50000) {
                bracket = "15%";
                tax = incomes[i] * 0.15;
            } else {
                bracket = "30%";
                tax = incomes[i] * 0.30;
            }

            totalTax += tax;

            System.out.println(
                "Citizen " + (i + 1) +
                " -> Income: " + incomes[i] +
                ", Bracket: " + bracket +
                ", Tax: " + tax
            );
        }

        System.out.println(totalTax);

    }
}