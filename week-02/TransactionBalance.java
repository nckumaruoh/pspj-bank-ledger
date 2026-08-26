/** Week 2: apply a deposit and withdrawal to a ledger balance. */
public class TransactionBalance {
    public static void main(String[] args) {
        double opening = 12500, deposit = 1500, withdrawal = 2000;
        double closing = opening + deposit - withdrawal;
        System.out.printf("Closing balance: Rs. %.2f%n", closing);
    }
}
