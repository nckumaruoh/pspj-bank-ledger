import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/** Week 11: save and reload a deliberately small, fictional CSV statement. */
public class BankWeek11 {
    public static void main(String[] args) throws IOException {
        Path statementFile = Path.of("ledger.csv");
        List<String> sampleLines = List.of(
                "date,description,change",
                "2026-08-01,Salary,1500",
                "2026-08-02,Rent,-2000",
                "2026-08-03,Utilities,-350");

        Files.write(statementFile, sampleLines, StandardCharsets.UTF_8);
        List<String> loadedLines = Files.readAllLines(statementFile, StandardCharsets.UTF_8);
        int closingBalance = 12500;

        for (int index = 1; index < loadedLines.size(); index++) {
            String[] fields = loadedLines.get(index).split(",");
            closingBalance += Integer.parseInt(fields[2]);
        }

        System.out.println("Saved 3 transactions to ledger.csv");
        System.out.println("Loaded transactions: " + (loadedLines.size() - 1));
        System.out.printf("Closing balance from file: Rs. %.2f%n", (double) closingBalance);
    }
}
