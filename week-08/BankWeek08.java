/** Week 8: use recursion to total a fixed list of sample expense values. */
public class BankWeek08 {
    public static void main(String[] args) {
        int[] expenses = {1200, 800, 500};
        int total = sumExpenses(expenses, 0);

        System.out.println("Expenses reviewed: " + expenses.length);
        System.out.printf("Recursive expense total: Rs. %.2f%n", (double) total);
    }

    static int sumExpenses(int[] expenses, int index) {
        if (index == expenses.length) {
            return 0;
        }
        return expenses[index] + sumExpenses(expenses, index + 1);
    }
}
