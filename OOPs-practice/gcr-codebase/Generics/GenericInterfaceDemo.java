interface Printer<T> {
    void print(T data);
}

class StringPrinter implements Printer<String> {
    @Override
    public void print(String data) {
        System.out.println("String: " + data);
    }
}

class IntegerPrinter implements Printer<Integer> {
    @Override
    public void print(Integer data) {
        System.out.println("Integer: " + data);
    }
}

public class GenericInterfaceDemo {
    public static void main(String[] args) {

        Printer<String> stringPrinter = new StringPrinter();
        Printer<Integer> integerPrinter = new IntegerPrinter();

        stringPrinter.print("Hello, Generics!");
        integerPrinter.print(100);
    }
}