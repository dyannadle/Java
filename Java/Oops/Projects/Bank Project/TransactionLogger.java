import java.io.*;
// import java.util.List;

public class TransactionLogger {

    public static void saveTransactions(BankAccount account) throws IOException {
        String filename = account.getAccountNumber() + "_transactions.txt";
        
        // Use try-with-resources for automatic resource closing
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            
            // Get transaction list directly from the BankAccount object
            for (String t : account.getTransactions()) { 
                writer.write(t);
                writer.newLine();
            }
        }
        System.out.println("Transactions saved to " + filename);
    }

    public static void loadTransactions(String filename) throws IOException {
        // Use try-with-resources for automatic resource closing
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("\n--- Transactions from file (" + filename + ") ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
