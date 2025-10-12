import java.util.Scanner;
import java.io.IOException;

public class BankATM {

    private static BankAccount currentAccount = null; // Currently logged-in account
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        // Setup initial accounts for demonstration
        SavingsAccount aliceSavings = new SavingsAccount("Alice", 5000.00, 5.0, 1000.00, 3, 50.00);
        CurrentAccount bobCurrent = new CurrentAccount("Bob", 1500.00, 2000.00, 12.0, 100.00);
        
        System.out.println("Welcome to the Interactive Bank ATM!");
        
        // --- Login Simulation ---
        System.out.println("\nAvailable Accounts (Simulated Login):");
        System.out.println("1. Alice's Savings Account (" + aliceSavings.getAccountNumber() + ")");
        System.out.println("2. Bob's Current Account (" + bobCurrent.getAccountNumber() + ")");
        System.out.print("Select account to login (1 or 2): ");
        
        int choice = getIntInput();
        if (choice == 1) {
            currentAccount = aliceSavings;
        } else if (choice == 2) {
            currentAccount = bobCurrent;
        } else {
            System.out.println("Invalid selection. Exiting.");
            return;
        }
        
        System.out.println("\n--- Successfully logged into " + currentAccount.getOwner() + "'s Account ---");
        
        showMainMenu();
        
        scanner.close();
        System.out.println("Thank you for using the ATM. Goodbye!");
    }
    
    // --- Main Menu Loop ---
    private static void showMainMenu() {
        boolean running = true;
        while (running) {
            System.out.println("\n===== ATM Main Menu =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Get Statement (Save Transactions)");
            System.out.println("5. Apply Account Operations (Interest/Overdraft)");
            System.out.println("6. Exit/Logout");
            System.out.print("Enter choice: ");
            
            int choice = getIntInput();
            
            try {
                switch (choice) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        deposit();
                        break;
                    case 3:
                        withdraw();
                        break;
                    case 4:
                        getStatement();
                        break;
                    case 5:
                        applyAccountSpecificOperations();
                        break;
                    case 6:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please select 1-6.");
                }
            } catch (InsufficientFundsException e) {
                System.out.println("\n!! TRANSACTION FAILED: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("\n!! INPUT ERROR: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("\n!! FILE ERROR: Could not save/load statement: " + e.getMessage());
            }
        }
    }
    
    // --- Utility Methods ---

    private static int getIntInput() {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.next(); // consume the invalid input
        }
        int value = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        return value;
    }

    private static double getDoubleInput() {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a numeric amount: ");
            scanner.next(); // consume the invalid input
        }
        double value = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        return value;
    }
    
    // --- Menu Actions ---

    private static void checkBalance() {
        System.out.printf("\nYour current balance is: %.2f\n", currentAccount.getBalance());
        // For debugging, show account details
        System.out.println(currentAccount.toString()); 
    }

    private static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = getDoubleInput();
        currentAccount.deposit(amount);
        System.out.printf("Deposit successful. New balance: %.2f\n", currentAccount.getBalance());
    }

    private static void withdraw() throws InsufficientFundsException {
        System.out.print("Enter amount to withdraw: ");
        double amount = getDoubleInput();
        currentAccount.withdraw(amount);
        System.out.printf("Withdrawal successful. New balance: %.2f\n", currentAccount.getBalance());
    }
    
    private static void getStatement() throws IOException {
        System.out.println("\n--- Printing and Saving Account Statement ---");
        TransactionLogger.saveTransactions(currentAccount);
        TransactionLogger.loadTransactions(currentAccount.getAccountNumber() + "_transactions.txt");
    }

    private static void applyAccountSpecificOperations() {
        if (currentAccount instanceof SavingsAccount) {
            SavingsAccount sa = (SavingsAccount) currentAccount;
            System.out.println("\n--- Savings Account Operations ---");
            System.out.println("1. Apply Annual Interest");
            System.out.println("2. Reset Monthly Withdrawals");
            System.out.print("Select operation: ");
            int op = getIntInput();
            if (op == 1) {
                sa.applyAnnualInterest();
                System.out.printf("Interest applied. New balance: %.2f\n", sa.getBalance());
            } else if (op == 2) {
                sa.resetMonthlyWithdrawals();
                System.out.println("Monthly withdrawal counter reset.");
            } else {
                System.out.println("Invalid operation.");
            }
        } else if (currentAccount instanceof CurrentAccount) {
            CurrentAccount ca = (CurrentAccount) currentAccount;
            System.out.println("\n--- Current Account Operation ---");
            System.out.println("1. Apply Monthly Overdraft Interest");
            System.out.print("Select operation: ");
            int op = getIntInput();
            if (op == 1) {
                ca.applyMonthlyOverdraftInterest();
                System.out.printf("Overdraft interest applied. New balance: %.2f\n", ca.getBalance());
            } else {
                System.out.println("Invalid operation.");
            }
        } else {
            System.out.println("No specific operations for this account type.");
        }
    }
}