// Custom Exception
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankTransactionSystem {

    private double balance;

    public BankTransactionSystem(double balance) {
        this.balance = balance;
    }

    // Withdraw method
    public void withdraw(double amount)
            throws InsufficientBalanceException {

        // Negative amount check
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }

        // Balance check
        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance!");
        }

        balance -= amount;

        System.out.println(
                "Withdrawal successful, new balance: ₹" + balance);
    }

    public static void main(String[] args) {

        BankTransactionSystem account =
                new BankTransactionSystem(5000);

        try {

            account.withdraw(7000);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }
    }
}