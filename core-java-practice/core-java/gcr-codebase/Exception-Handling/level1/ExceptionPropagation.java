public class ExceptionPropagation {

    // Method 1: Generates exception
    public static void method1() {
        int result = 10 / 0; // ArithmeticException
    }

    // Method 2: Calls method1
    public static void method2() {
        method1();
    }

    public static void main(String[] args) {

        try {

            // Calls method2
            method2();

        } catch (ArithmeticException e) {

            System.out.println("Handled exception in main");
        }
    }
}