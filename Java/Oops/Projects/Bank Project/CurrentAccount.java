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
        double projected = this.balance - amount;

        if (projected < -overdraftLimit) {
            throw new InsufficientFundsException("Overdraft limit exceeded. Limit: " + overdraftLimit +
                                                 ", Requested would lead to: " + projected);
        }

        // If balance goes negative, apply overdraft fee once per withdrawal
        if (this.balance >= 0 && projected < 0) {
            projected -= overdraftFee;
        }

        this.balance = projected;
    }

    // Apply monthly overdraft interest if balance is negative
    public synchronized void applyMonthlyOverdraftInterest() {
        if (this.balance < 0) {
            double monthlyRate = overdraftInterestRate / 12 / 100.0;
            double interest = Math.abs(this.balance) * monthlyRate;
            this.balance -= interest; // deduct interest (worsens debt)
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
