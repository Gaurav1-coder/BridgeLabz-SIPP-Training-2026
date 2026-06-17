public class NestedTryCatchDemo {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int index = 2;
        int divisor = 0;

        try {

            // Outer try for array access
            try {

                int value = arr[index];

                // Inner try for division
                try {

                    int result = value / divisor;
                    System.out.println("Result: " + result);

                } catch (ArithmeticException e) {

                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Invalid array index!");
            }

        } catch (Exception e) {

            System.out.println("Unexpected error occurred.");
        }
    }
}