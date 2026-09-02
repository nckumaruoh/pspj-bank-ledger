import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Week 12 final report: collections and streams over fictional ledger data.
 * It is an educational console exercise, not a real financial product.
 */
public class BankLedger {
    public static void main(String[] args) {
        int openingBalance = 12500;
        List<Transaction> transactions = List.of(
                new Transaction("Salary", "Deposit", 1500),
                new Transaction("Rent", "Expense", -2000),
                new Transaction("Utilities", "Expense", -350));

        int closingBalance = openingBalance + transactions.stream()
                .mapToInt(Transaction::change)
                .sum();
        int deposits = transactions.stream()
                .filter(transaction -> transaction.change() > 0)
                .mapToInt(Transaction::change)
                .sum();
        int withdrawals = transactions.stream()
                .filter(transaction -> transaction.change() < 0)
                .mapToInt(transaction -> Math.abs(transaction.change()))
                .sum();
        Transaction largestDebit = transactions.stream()
                .filter(transaction -> transaction.change() < 0)
                .min((first, second) -> Integer.compare(first.change(), second.change()))
                .orElseThrow();
        Map<String, Long> categories = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::category,
                        LinkedHashMap::new, Collectors.counting()));

        System.out.println("PERSONAL BANK LEDGER - FINAL RELEASE");
        System.out.printf("Opening balance: Rs. %.2f%n", (double) openingBalance);
        System.out.printf("Closing balance: Rs. %.2f%n", (double) closingBalance);
        System.out.printf("Deposits: Rs. %.2f%n", (double) deposits);
        System.out.printf("Withdrawals: Rs. %.2f%n", (double) withdrawals);
        System.out.printf("Largest debit: %s (Rs. %.2f)%n",
                largestDebit.description(), (double) Math.abs(largestDebit.change()));
        System.out.printf("Categories: Deposit=%d, Expense=%d%n",
                categories.getOrDefault("Deposit", 0L), categories.getOrDefault("Expense", 0L));
    }

    static class Transaction {
        private final String description;
        private final String category;
        private final int change;

        Transaction(String description, String category, int change) {
            this.description = description;
            this.category = category;
            this.change = change;
        }

        String description() {
            return description;
        }

        String category() {
            return category;
        }

        int change() {
            return change;
        }
    }
}
