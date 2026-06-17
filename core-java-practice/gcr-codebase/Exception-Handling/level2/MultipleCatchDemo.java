public class MultipleCatchDemo {

    public static void main(String[] args) {

        // Change values to test different cases
        int[] arr = {10, 20, 30, 40, 50};
        int index = 2;

        try {

            int value = arr[index];

            System.out.println(
                    "Value at index " + index + ": " + value);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid index!");

        } catch (NullPointerException e) {

            System.out.println("Array is not initialized!");
        }
    }
}