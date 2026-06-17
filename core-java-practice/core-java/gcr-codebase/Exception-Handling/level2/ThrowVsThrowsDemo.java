public class ThrowVsThrowsDemo {

    // Method propagates exception using throws
    public static double calculateInterest(double amount,
                                           double rate,
                                           int years)
            throws IllegalArgumentException {

        // Throw exception if input is invalid
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException(
                    "Amount and rate must be positive");
        }

        // Simple Interest Formula
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {

        double amount = -10000;
        double rate = 5;
        int years = 2;

        try {

            double interest =
                    calculateInterest(amount, rate, years);

            System.out.println("Interest: ₹" + interest);

        } catch (IllegalArgumentException e) {

            System.out.println(
                    "Invalid input: Amount and rate must be positive");
        }
    }
}