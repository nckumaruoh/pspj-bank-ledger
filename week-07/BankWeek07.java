/** Week 7: protect the ledger against invalid and insufficient-fund actions. */
public class BankWeek07 {
    public static void main(String[] args) {
        LedgerDesk desk = new LedgerDesk(1000.00);
        desk.deposit(500.00);
        desk.withdraw(2000.00);
        desk.withdraw(0.00);
        System.out.printf("Current balance: Rs. %.2f%n", desk.balance);
    }

    static class LedgerDesk {
        private double balance;

        LedgerDesk(double openingBalance) {
            balance = openingBalance;
        }

        void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid amount rejected.");
                return;
            }
            balance += amount;
            System.out.printf("Deposit accepted: Rs. %.2f%n", amount);
        }

        void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid amount rejected.");
            } else if (amount > balance) {
                System.out.println("Withdrawal rejected: insufficient funds.");
            } else {
                balance -= amount;
                System.out.printf("Withdrawal accepted: Rs. %.2f%n", amount);
            }
        }
    }
}
