// CurrentAccount.java
/**
 * CurrentAccount: allows overdraft up to a limit (negative balance allowed down to -overdraftLimit).
 * Demonstrates overriding withdraw to allow overdraft within limit.
 * Adds overdraft interest/fee system.
 */
public class CurrentAccount extends BankAccount {
    private double overdraftLimit;   // e.g., 5000 means you can go down to -5000
    private final double overdraftInterestRate; // annual rate applied on overdraft
    private final double overdraftFee;          // flat fee each time account goes negative

    public CurrentAccount(String owner, double initialDeposit, double overdraftLimit) {
        this(owner, initialDeposit, overdraftLimit, 12.0, 100.0); // default: 12% annual, ₹100 overdraft fee
    }

    public CurrentAccount(String owner, double initialDeposit,
                          double overdraftLimit, double overdraftInterestRate, double overdraftFee) {
        super(owner, Math.max(0, initialDeposit)); // disallow negative initial deposit
        if (overdraftLimit < 0) throw new IllegalArgumentException("Overdraft limit cannot be negative");
        if (overdraftInterestRate < 0) throw new IllegalArgumentException("Overdraft interest rate cannot be negative");
        if (overdraftFee < 0) throw new IllegalArgumentException("Overdraft fee cannot be negative");

        this.overdraftLimit = overdraftLimit;
        this.overdraftInterestRate = overdraftInterestRate;
        this.overdraftFee = overdraftFee;
    }

    // Withdraw with overdraft allowed
    @Override
    public synchronized void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) throw new IllegalArgumentException("Withdraw amount must be positive");
        
        double deduction = amount;
        String logMessage = "Withdrawal: " + amount;

        // Check if the withdrawal causes the balance to go negative, or is already negative
        if (this.balance - amount < 0) {
            // Check if limit exceeded before fee
            if (this.balance - amount < -overdraftLimit) {
                throw new InsufficientFundsException("Overdraft limit exceeded. Limit: " + overdraftLimit +
                                                     ", Requested would lead to: " + (this.balance - amount));
            }
            
            // Apply overdraft fee if balance becomes negative or is already negative.
            deduction += overdraftFee;
            logMessage += " + Overdraft Fee: " + overdraftFee;
            
            // Check if limit exceeded *after* applying the fee
            if (this.balance - deduction < -overdraftLimit) {
                 throw new InsufficientFundsException("Overdraft limit exceeded after fee. Limit: " + overdraftLimit +
                                                     ", Requested would lead to: " + (this.balance - deduction));
            }
        }
        
        // Final update
        this.balance -= deduction;
        logMessage += ". New balance: " + this.balance;
        logTransaction(logMessage);
    }

    // Apply monthly overdraft interest if balance is negative
    public synchronized void applyMonthlyOverdraftInterest() {
        if (this.balance < 0) {
            double monthlyRate = overdraftInterestRate / 12 / 100.0;
            double interest = Math.abs(this.balance) * monthlyRate;
            this.balance -= interest; // deduct interest (worsens debt)
            logTransaction("Applied monthly overdraft interest: -" + interest);
        }
    }

    public synchronized double getOverdraftLimit() {
        return overdraftLimit;
    }

    public synchronized void setOverdraftLimit(double overdraftLimit) {
        if (overdraftLimit < 0) throw new IllegalArgumentException("Overdraft limit cannot be negative");
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        return String.format("Current%s | OverdraftLimit=%.2f | OvdRate=%.2f%% | Fee=%.2f",
                super.toString(), overdraftLimit, overdraftInterestRate, overdraftFee);
    }
}