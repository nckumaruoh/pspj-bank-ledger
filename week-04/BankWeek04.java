/**
 * Week 4: use a menu-shaped loop to replay a small ledger workflow.
 * This is an academic simulation, not a real banking application.
 */
public class BankWeek04 {
    public static void main(String[] args) {
        double balance = 12500.00;
        String[] actions = {"Deposit", "Withdrawal"};
        double[] amounts = {1500.00, 2000.00};

        System.out.println("=== LEDGER MENU ===");
        System.out.println("1. Record deposit");
        System.out.println("2. Record withdrawal");
        System.out.println("3. View statement");

        int index = 0;
        while (index < actions.length) {
            if (actions[index].equals("Deposit")) {
                balance += amounts[index];
            } else {
                balance -= amounts[index];
            }
            System.out.printf("%s Rs. %.2f -> balance Rs. %.2f%n",
                    actions[index], amounts[index], balance);
            index++;
        }
        System.out.println("Transactions processed: " + actions.length);
    }
}
