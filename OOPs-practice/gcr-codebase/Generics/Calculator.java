class Calculator {

    // Bounded Type Parameter
    public static <T extends Number> double square(T num) {
        return num.doubleValue() * num.doubleValue();
    }

    public static void main(String[] args) {

        System.out.println(square(5));      // Integer
        System.out.println(square(4.5));    // Double
        System.out.println(square(7.2f));   // Float

        // System.out.println(square("Hello")); // Compile-time Error
    }
}