public class GenericMethodDemo {

    // Generic Method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] numbers = {10, 20, 30, 40};
        String[] names = {"Deepika", "Rahul", "Ankit"};
        Double[] marks = {85.5, 90.0, 78.5};

        printArray(numbers);
        printArray(names);
        printArray(marks);
    }
}