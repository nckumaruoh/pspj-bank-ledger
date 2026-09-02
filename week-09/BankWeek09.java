/** Week 9: represent an account and a transaction with small domain classes. */
public class BankWeek09 {
    public static void main(String[] args) {
        Account account = new Account("Kiran Patel", 12000.00);
        Transaction latest = new Transaction("Withdrawal", 2000.00);

        System.out.printf("Account: %s | balance Rs. %.2f%n",
                account.getHolder(), account.getBalance());
        System.out.printf("Latest transaction: %s Rs. %.2f%n",
                latest.getType(), latest.getAmount());
    }

    static class Account {
        private final String holder;
        private final double balance;

        Account(String holder, double balance) {
            this.holder = holder;
            this.balance = balance;
        }

        String getHolder() {
            return holder;
        }

        double getBalance() {
            return balance;
        }
    }

    static class Transaction {
        private final String type;
        private final double amount;

        Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }

        String getType() {
            return type;
        }

        double getAmount() {
            return amount;
        }
    }
}
