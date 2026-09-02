/** Week 10: translate invalid sample amounts into clear validation feedback. */
public class BankWeek10 {
    public static void main(String[] args) {
        String[] sampleAmounts = {"500", "-1", "abc"};

        for (String sampleAmount : sampleAmounts) {
            try {
                double amount = parsePositiveAmount(sampleAmount);
                System.out.printf("Accepted amount: Rs. %.2f%n", amount);
            } catch (InvalidTransactionException exception) {
                System.out.printf("Rejected amount '%s': %s%n", sampleAmount, exception.getMessage());
            }
        }
    }

    static double parsePositiveAmount(String text) throws InvalidTransactionException {
        try {
            double amount = Double.parseDouble(text);
            if (amount <= 0) {
                throw new InvalidTransactionException("Amount must be greater than zero.");
            }
            return amount;
        } catch (NumberFormatException exception) {
            throw new InvalidTransactionException("Amount must be numeric.");
        }
    }

    static class InvalidTransactionException extends Exception {
        InvalidTransactionException(String message) {
            super(message);
        }
    }
}
