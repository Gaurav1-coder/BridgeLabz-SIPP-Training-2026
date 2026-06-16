public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;

        // This will throw NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            System.out.println("Cannot call methods on a null object.");
        }
    }

    public static void main(String[] args) {

        // Uncomment this to see the exception being generated
        // generateException();

        // Refactored code to handle the exception
        handleException();
    }
}