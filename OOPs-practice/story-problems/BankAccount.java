public class BankAccount {

    private String accountNumber;
    private String holderName;
    private double balance;

    private static int totalAccounts = 0;

    public BankAccount(String accountNumber,
                       String holderName,
                       double balance) {

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;

        totalAccounts++;
    }

    // Deposit Method
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println(
                    amount + " deposited into Account "
                            + accountNumber);
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {

        if (amount <= balance) {

            balance -= amount;

            System.out.println(
                    amount + " withdrawn from Account "
                            + accountNumber);

        } else {

            System.out.println(
                    "Transaction Failed! Insufficient Balance in Account "
                            + accountNumber);
        }
    }

    // Account Statement
    public void getStatement() {

        System.out.println("\n===== ACCOUNT STATEMENT =====");

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : " + balance);

        System.out.println("=============================");
    }

    // Static Method
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {

        BankAccount acc1 =
                new BankAccount("ACC101",
                        "Deepika",
                        10000);

        BankAccount acc2 =
                new BankAccount("ACC102",
                        "Aman",
                        15000);

        BankAccount acc3 =
                new BankAccount("ACC103",
                        "Riya",
                        20000);

        // 5 Transactions - Account 1
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.deposit(500);
        acc1.withdraw(3000);
        acc1.withdraw(12000);

        // 5 Transactions - Account 2
        acc2.deposit(4000);
        acc2.withdraw(2000);
        acc2.deposit(1500);
        acc2.withdraw(5000);
        acc2.withdraw(1000);

        // 5 Transactions - Account 3
        acc3.deposit(2500);
        acc3.withdraw(3000);
        acc3.deposit(1000);
        acc3.withdraw(500);
        acc3.withdraw(25000);

        // Statements
        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        System.out.println(
                "\nTotal Accounts Created: "
                        + BankAccount.getTotalAccounts());
    }
}