import java.util.Arrays;
import java.util.List;

public class GenericStreamDemo {

    // Generic method using Streams
    public static <T> void printElements(List<T> list) {
        list.stream()
            .forEach(element -> System.out.println(element));
    }

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Deepika", "Rahul", "Ankit");
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        System.out.println("Names:");
        printElements(names);

        System.out.println("\nNumbers:");
        printElements(numbers);
    }
}