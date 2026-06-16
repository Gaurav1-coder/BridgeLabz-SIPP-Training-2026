import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {

        int number = Integer.parseInt(text);

        System.out.println("Number = " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {

        try {
            int number = Integer.parseInt(text);
            System.out.println("Number = " + number);
        } 
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
            System.out.println("Input is not a valid integer.");
        } 
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught!");
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        String text = sc.nextLine();

        // Uncomment to generate exception and stop program
        // generateException(text);

        // Handle exception
        handleException(text);
    }
}