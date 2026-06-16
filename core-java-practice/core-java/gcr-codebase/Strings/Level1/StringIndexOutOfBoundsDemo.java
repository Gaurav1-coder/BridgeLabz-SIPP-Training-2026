import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {

        // Accessing index beyond string length
        System.out.println(text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {

        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught!");
            System.out.println("Index is beyond the length of the string.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        // Uncomment to see the exception generated
        // generateException(text);

        // Handle the exception
        handleException(text);

    }
}