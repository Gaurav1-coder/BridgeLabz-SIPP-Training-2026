public class MathWizard {

    // Instance Variable
    int instanceVar = 100;

    // Prime Check
    public boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Factorial for int
    public long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Overloaded Factorial for double
    public double factorial(double n) {
        double fact = 1;

        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Fibonacci Series
    public void fibonacci(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
    }

    // GCD using Euclidean Algorithm
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // LCM
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Power
    public long power(int base, int exp) {
        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    // Scope Demonstration
    public void showScope() {
        int localVar = 50; // Local Variable

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
    }

    public static void main(String[] args) {

        MathWizard mw = new MathWizard();

        System.out.println("Prime Check (17): " + mw.isPrime(17));

        System.out.println("Factorial(5): " + mw.factorial(5));

        System.out.println("Factorial(6.0): " + mw.factorial(6.0));

        mw.fibonacci(10);

        System.out.println("GCD(24, 36): " + mw.gcd(24, 36));

        System.out.println("LCM(24, 36): " + mw.lcm(24, 36));

        System.out.println("Power(2, 5): " + mw.power(2, 5));

        mw.showScope();
    }
}