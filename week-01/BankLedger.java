/** Week 1: establish a ledger opening balance and a sample transaction. */
public class BankLedger {
    public static void main(String[] args) {
        String accountHolder = "Kiran Patel";
        double openingBalance = 12500.00;
        double deposit = 1500.00;
        System.out.println("=== Personal Bank Ledger & Statement Generator ===");
        System.out.println("Account holder: " + accountHolder);
        System.out.printf("Opening balance: Rs. %.2f%n", openingBalance);
        System.out.printf("Sample deposit: Rs. %.2f%n", deposit);
        System.out.println("Next: calculate transactions and balances in Week 2.");
    }
}
