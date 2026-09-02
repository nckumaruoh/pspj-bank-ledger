/** Week 5: extract ledger actions into reusable methods. */
public class BankWeek05 {
    public static void main(String[] args) {
        double balance = 12500.00;
        balance = deposit(balance, 1500.00);
        System.out.println("After deposit: " + format(balance));
        balance = withdraw(balance, 2000.00);
        System.out.println("After withdrawal: " + format(balance));
        System.out.println("Transaction status: completed");
    }

    static double deposit(double balance, double amount) {
        return balance + amount;
    }

    static double withdraw(double balance, double amount) {
        if (amount <= 0 || amount > balance) {
            throw new IllegalArgumentException("Withdrawal must be positive and within the sample balance.");
        }
        return balance - amount;
    }

    static String format(double amount) {
        return String.format("Rs. %.2f", amount);
    }
}
