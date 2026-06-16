import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in inches: ");
        double base = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        double areaInSquareInches = 0.5 * base * height;
        double areaInSquareCentimeters = areaInSquareInches * 6.4516;

        System.out.println("The area of the triangle is "
                + areaInSquareInches + " square inches and "
                + areaInSquareCentimeters + " square centimeters");

        input.close();
    }
}