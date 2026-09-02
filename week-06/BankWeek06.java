/** Week 6: keep small statement data in parallel arrays and search it. */
public class BankWeek06 {
    public static void main(String[] args) {
        String[] descriptions = {"Salary", "Rent", "Utilities"};
        double[] changes = {1500.00, -2000.00, -350.00};
        int rentIndex = findDescription(descriptions, "Rent");
        int largestDebitIndex = findLargestDebit(changes);

        System.out.printf("Search Rent -> Rs. %.2f%n", changes[rentIndex]);
        System.out.printf("Largest debit: %s (Rs. %.2f)%n",
                descriptions[largestDebitIndex], Math.abs(changes[largestDebitIndex]));
        System.out.println("Transactions tracked: " + descriptions.length);
    }

    static int findDescription(String[] descriptions, String searchTerm) {
        for (int index = 0; index < descriptions.length; index++) {
            if (descriptions[index].equalsIgnoreCase(searchTerm)) {
                return index;
            }
        }
        return -1;
    }

    static int findLargestDebit(double[] changes) {
        int largestDebitIndex = -1;
        for (int index = 0; index < changes.length; index++) {
            if (changes[index] < 0 && (largestDebitIndex == -1
                    || changes[index] < changes[largestDebitIndex])) {
                largestDebitIndex = index;
            }
        }
        return largestDebitIndex;
    }
}
