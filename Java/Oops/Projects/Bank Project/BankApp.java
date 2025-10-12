// BankApp.java - New Demo file for the corrected BankAccount hierarchy
import java.io.IOException;

public class BankApp {

    public static void main(String[] args) {
        // 1. Create a Savings Account (min balance 1000, 3 free withdrawals, 5% rate)
        SavingsAccount savAcc = new SavingsAccount("Alice", 5000.00, 5.0, 1000.00, 3, 50.00);
        System.out.println(savAcc);

        // 2. Create a Current Account (overdraft limit 2000, 12% rate, 100 fee)
        CurrentAccount currAcc = new CurrentAccount("Bob", 1500.00, 2000.00, 12.0, 100.00);
        System.out.println(currAcc);

        System.out.println("\n--- Savings Account Operations ---");
        try {
            savAcc.deposit(500.00);             // Withdrawal 1 (Free)
            savAcc.withdraw(100.00);            // Withdrawal 2 (Free)
            savAcc.withdraw(100.00);            // Withdrawal 3 (Free)
            savAcc.withdraw(100.00);            // Withdrawal 4 (Subject to ₹50 fee, Total deduction: 150)
            
            // Try to withdraw an amount that would breach the minimum balance (Current balance is 5000 + 500 - 100 - 100 - 100 - 150 = 5050)
            // Minimum balance is 1000. 5050 - 4000 = 1050 (Safe)
            savAcc.withdraw(4000.00);           
            
            // This withdrawal should fail (5050 - 4000 = 1050. 1050 - 150 = 900 < 1000)
            savAcc.withdraw(50.00);             

        } catch (InsufficientFundsException e) {
            System.out.println("Savings Exception caught: " + e.getMessage());
        } finally {
            savAcc.applyAnnualInterest();
            System.out.println(savAcc);
        }

        System.out.println("\n--- Current Account Operations ---");
        try {
            currAcc.withdraw(1000.00);          // Balance: 1500 - 1000 = 500
            currAcc.withdraw(1000.00);          // Balance: 500 - 1000 = -500 (Overdraft triggered, Fee applied: 100. New balance: -600)
            currAcc.withdraw(1000.00);          // Balance: -600 - 1000 = -1600 (Already negative, Fee applied: 100. New balance: -1700)
            currAcc.applyMonthlyOverdraftInterest(); // Balance is now slightly worse due to interest

            // This withdrawal should fail (-1700 - 500 = -2200. Fee applied: 100. Total -2300 > -2000 limit)
            currAcc.withdraw(500.00);
            
        } catch (InsufficientFundsException e) {
            System.out.println("Current Exception caught: " + e.getMessage());
        } finally {
            System.out.println(currAcc);
        }
        
        System.out.println("\n--- Transaction Logging ---");
        try {
            TransactionLogger.saveTransactions(savAcc);
            TransactionLogger.saveTransactions(currAcc);
            
            // Load transactions back from file
            TransactionLogger.loadTransactions(savAcc.getAccountNumber() + "_transactions.txt");
            
        } catch (IOException e) {
            System.err.println("File operation failed: " + e.getMessage());
        }
    }
}