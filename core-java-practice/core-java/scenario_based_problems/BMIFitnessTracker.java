import java.util.Scanner;

public class BMIFitnessTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input height in meters
        System.out.print("Enter height (in meters): ");
        double height = sc.nextDouble();

        // Input weight in kilograms
        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();

        // BMI Formula
        double bmi = weight / (height * height);

        System.out.println("BMI: " + bmi);

        // BMI Categories
        if (bmi < 18.5) {

            System.out.println("Category: Underweight");

        } else if (bmi < 25) {

            System.out.println("Category: Normal");

        } else {

            System.out.println("Category: Overweight");
        }

        sc.close();
    }
}