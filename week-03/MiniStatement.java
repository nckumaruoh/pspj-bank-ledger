/** Week 3: print a small sequential transaction statement. */
public class MiniStatement {
    public static void main(String[] args) {
        double balance = 12500; double[] changes = {1500, -2000, -350};
        for (double change : changes) { balance += change; System.out.printf("Transaction %+,.2f -> Rs. %,.2f%n", change, balance); }
    }
}
