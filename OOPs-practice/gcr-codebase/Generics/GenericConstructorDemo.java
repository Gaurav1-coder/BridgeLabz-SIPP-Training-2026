class Box<T> {
    private T value;

    // Generic Constructor
    public <U> Box(U input, T value) {
        System.out.println("Input: " + input);
        this.value = value;
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}

public class GenericConstructorDemo {
    public static void main(String[] args) {

        Box<String> box1 = new Box<>(100, "Hello");
        box1.display();

        Box<Integer> box2 = new Box<>("Java", 200);
        box2.display();
    }
}