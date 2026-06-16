import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate exception
    public static void generateException(String text) {

        int start = 5;
        int end = 2;

        // start > end
        System.out.println(text.substring(start, end));
    }

    // Method to handle exception
    public static void handleException(String text) {

        int start = 5;
        int end = 2;

        try {
            System.out.println(text.substring(start, end));
        } 
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
            System.out.println(e.getMessage());
        } 
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught!");
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Uncomment to generate exception and stop program
        // generateException(text);

        // Handle exception
        handleException(text);

    }
}