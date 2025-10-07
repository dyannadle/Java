import java.util.*;

// Account class
class Account {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

// SavingsAccount class
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest applied: " + interest);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Account Type: Savings");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// CurrentAccount class
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Exceeds overdraft limit or invalid amount.");
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Account Type: Current");
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

// Main class with Menu-Driven Program
public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Bank Menu =====");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Apply Interest (Savings only)");
            System.out.println("6. Display Account Details");
            System.out.println("7. List All Accounts");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String saNum = sc.next();
                    System.out.print("Enter Account Holder Name: ");
                    String saName = sc.next();
                    System.out.print("Enter Initial Balance: ");
                    double saBalance = sc.nextDouble();
                    System.out.print("Enter Interest Rate: ");
                    double rate = sc.nextDouble();
                    accounts.add(new SavingsAccount(saNum, saName, saBalance, rate));
                    System.out.println("Savings Account created successfully!");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    String caNum = sc.next();
                    System.out.print("Enter Account Holder Name: ");
                    String caName = sc.next();
                    System.out.print("Enter Initial Balance: ");
                    double caBalance = sc.nextDouble();
                    System.out.print("Enter Overdraft Limit: ");
                    double limit = sc.nextDouble();
                    accounts.add(new CurrentAccount(caNum, caName, caBalance, limit));
                    System.out.println("Current Account created successfully!");
                    break;

                case 3:
                    Account depAcc = findAccount(sc, accounts);
                    if (depAcc != null) {
                        System.out.print("Enter amount to deposit: ");
                        double dep = sc.nextDouble();
                        depAcc.deposit(dep);
                    }
                    break;

                case 4:
                    Account wdAcc = findAccount(sc, accounts);
                    if (wdAcc != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double wd = sc.nextDouble();
                        wdAcc.withdraw(wd);
                    }
                    break;


                case 5:
                    Account intAcc = findAccount(sc, accounts);
                    if (intAcc instanceof SavingsAccount) {
                        ((SavingsAccount) intAcc).applyInterest();
                    } else {
                        System.out.println("Interest can only be applied to Savings Account.");
                    }
                    break;

                case 6:
                    Account dispAcc = findAccount(sc, accounts);
                    if (dispAcc != null) {
                        dispAcc.displayDetails();
                    }
                    break;

                case 7:
                    if (accounts.isEmpty()) {
                        System.out.println("No accounts available.");
                    } else {
                        System.out.println("\n--- All Accounts ---");
                        for (Account acc : accounts) {
                            acc.displayDetails();
                            System.out.println("-----------------");
                        }
                    }
                    break;

                case 8:
                    System.out.println("Exiting... Thank you for using the Bank System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Utility function to find account by account number
    private static Account findAccount(Scanner sc, ArrayList<Account> accounts) {
        if (accounts.isEmpty()) {
            System.out.println("No accounts exist. Please create an account first.");
            return null;
        }
        System.out.print("Enter Account Number: ");
        String accNum = sc.next();
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accNum)) {
                return acc;
            }
        }
        System.out.println("Account not found!");
        return null;
    }
}
