// SavingsAccount.java
/**
 * SavingsAccount: has minimum balance requirement and interest.
 * Demonstrates inheritance, overriding withdraw, and interest application.
 */
public class SavingsAccount extends BankAccount {
    private final double interestRatePercent; // e.g., 4.0 for 4%
    private final double minBalance;          // minimum balance required
    private int withdrawalsThisMonth;         // track withdrawals
    private final int freeWithdrawals;        // free withdrawals allowed
    private final double withdrawalFee;       // fee after free withdrawals

    public SavingsAccount(String owner, double initialDeposit,
                          double interestRatePercent, double minBalance) {
        this(owner, initialDeposit, interestRatePercent, minBalance, 3, 50.0); // default: 3 free, ₹50 fee
    }

    public SavingsAccount(String owner, double initialDeposit,
                          double interestRatePercent, double minBalance,
                          int freeWithdrawals, double withdrawalFee) {
        super(owner, initialDeposit);
        if (interestRatePercent < 0) throw new IllegalArgumentException("Interest rate cannot be negative");
        if (minBalance < 0) throw new IllegalArgumentException("Minimum balance cannot be negative");
        if (freeWithdrawals < 0) throw new IllegalArgumentException("Free withdrawals cannot be negative");
        if (withdrawalFee < 0) throw new IllegalArgumentException("Withdrawal fee cannot be negative");

        this.interestRatePercent = interestRatePercent;
        this.minBalance = minBalance;
        this.freeWithdrawals = freeWithdrawals;
        this.withdrawalFee = withdrawalFee;
        this.withdrawalsThisMonth = 0;
    }

    // Override withdraw to enforce minimum balance + fees after limit
    @Override
    public synchronized void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) throw new IllegalArgumentException("Withdraw amount must be positive");

        double totalDeduction = amount;

        // check withdrawal count
        if (withdrawalsThisMonth >= freeWithdrawals) {
            totalDeduction += withdrawalFee;
        }

        double projected = this.balance - totalDeduction;
        if (projected < minBalance) {
            throw new InsufficientFundsException(
                "Withdrawal would breach minimum balance (" + minBalance + "). Current: " + balance
            );
        }

        // Allowed
        this.balance = projected;
        withdrawalsThisMonth++;
    }



    // Apply annual interest
    public synchronized void applyAnnualInterest() {
        double interest = this.balance * (interestRatePercent / 100.0);
        this.balance += interest;
    }

    // Reset withdrawals at the start of new month
    public synchronized void resetMonthlyWithdrawals() {
        withdrawalsThisMonth = 0;
    }

    @Override
    public String toString() {
        return String.format("Savings%s | Rate=%.2f%% | MinBal=%.2f | Withdrawals=%d/%d",
                super.toString(), interestRatePercent, minBalance,
                withdrawalsThisMonth, freeWithdrawals);
    }
}
