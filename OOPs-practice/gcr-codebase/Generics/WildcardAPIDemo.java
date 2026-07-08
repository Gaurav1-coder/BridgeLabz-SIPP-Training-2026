import java.util.ArrayList;
import java.util.List;

public class WildcardAPIDemo {

    // Good: Wildcard used only in method parameter
    public static void printList(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }
    }

    // Good: Return a specific type instead of a wildcard
    public static List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        return numbers;
    }

    public static void main(String[] args) {

        List<Integer> numbers = getNumbers();

        printList(numbers);

        // Avoid this:
        // public static List<? extends Number> getNumbers() { ... }
    }
}