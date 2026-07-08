import java.util.ArrayList;
import java.util.List;

public class RawTypeDemo {

    public static void main(String[] args) {

        // Raw Type (Not Recommended)
        List rawList = new ArrayList();
        rawList.add("Deepika");
        rawList.add(100); // Allowed

        System.out.println("Raw List: " + rawList);

        // Parameterized Type (Recommended)
        List<String> stringList = new ArrayList<>();
        stringList.add("Deepika");
        stringList.add("Rahul");
        // stringList.add(100); // Compile-time Error

        System.out.println("Generic List: " + stringList);
    }
}