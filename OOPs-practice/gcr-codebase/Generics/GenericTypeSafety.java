import java.util.ArrayList;

public class GenericTypeSafety {
    public static void main(String[] args) {

        // Generic ArrayList - allows only String values
        ArrayList<String> list = new ArrayList<>();

        list.add("Deepika");
        list.add("Rahul");
        list.add("Ankit");

        // Uncommenting the line below will cause a compile-time error
        // list.add(100);

        for (String name : list) {
            System.out.println(name);
        }
    }
}