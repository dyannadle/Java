// BankAccount.java
/**
 * Base class demonstrating encapsulation and basic account operations.
 */
import java.util.ArrayList;
import java.util.List;


/**
 * Base class demonstrating encapsulation and basic account operations.
 */
public class BankAccount {
    private final String accountNumber;
    private final String owner;
    protected double balance; 
    private final List<String> transactions; // NEW: List to track transactions

    private static int nextAccountNumber = 10000001; // simple generator

    public BankAccount(String owner, double initialDeposit) {
        if (owner == null || owner.isBlank()) throw new IllegalArgumentException("Owner required");
        if (initialDeposit < 0) throw new IllegalArgumentException("Initial deposit cannot be negative");
        this.owner = owner;
        this.balance = initialDeposit;
        this.accountNumber = generateAccountNumber();
        this.transactions = new ArrayList<>(); // Initialize transaction list
        logTransaction("Account created with initial deposit: " + initialDeposit);  // Log account creation
        // Increment for next account
    }

    private static synchronized String generateAccountNumber() {
        return String.valueOf(nextAccountNumber++);
    }
    
    // Helper for logging
    protected void logTransaction(String message) {
        transactions.add(String.format("[%tF %tT] %s", System.currentTimeMillis(), System.currentTimeMillis(), message));
    }

    // Encapsulated deposit method
    public synchronized void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit amount must be positive");
        balance += amount;
        logTransaction("Deposit: " + amount + ". New balance: " + balance);
    }

    // Withdraw in base class: does NOT allow overdraft
    public synchronized void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) throw new IllegalArgumentException("Withdraw amount must be positive");
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance. Requested: " + amount + ", Available: " + balance);
        }
        balance -= amount;
        logTransaction("Withdrawal: " + amount + ". New balance: " + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public synchronized double getBalance() {
        return balance;
    }
    
    // NEW: Getter for transactions (needed by TransactionLogger)
    public List<String> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return String.format("Account[%s] Owner=%s Balance=%.2f", accountNumber, owner, balance);
    }
}
