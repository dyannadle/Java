🏦 Bank ATM Simulator (Java OOP Project)
This project is a console-based, menu-driven Bank ATM Simulator implemented in Java. It demonstrates key Object-Oriented Programming (OOP) principles, including inheritance, polymorphism, encapsulation, and robust exception handling to manage different types of bank accounts and their specific business rules.

✨ Features
Interactive Menu: Allows users to log in to a simulated account and perform typical ATM operations.

Account Hierarchy: Utilizes a base BankAccount class with specialized subclasses (SavingsAccount and CurrentAccount).

Specialized Logic:

Savings Accounts: Enforce a minimum balance and apply a fee after a set number of free monthly withdrawals.

Current Accounts: Allow overdraft up to a defined limit and apply an overdraft fee and interest when the balance is negative.

Robust Error Handling: Uses a custom InsufficientFundsException to catch and manage invalid transactions gracefully.

Transaction Logging: Automatically logs all deposits, withdrawals, and interest applications. Transactions can be saved to and loaded from account-specific text files.

Thread Safety: Critical balance-modifying methods are synchronized for multi-threading safety.
▶️ How to Compile and Run
This project requires the Java Development Kit (JDK) to be installed on your system.

1. Compile the Source Files
Navigate to the project directory (Bank Project) in your command line or terminal (use quotes if the path contains spaces).

Bash

# Navigate to your project folder
cd /path/to/Bank Project

# Compile all .java files
javac *.java
2. Run the Interactive ATM
Execute the main class file, BankATM.

Bash

java BankATM
⚙️ Usage Instructions
Select Account: The program starts with a simulated login, asking you to select one of the two pre-created demonstration accounts (Alice's Savings or Bob's Current).

Use Menu: Enter the corresponding number (1-6) to perform operations.

Withdrawals (Crucial Test):

Test the Savings Account by withdrawing multiple times to trigger the withdrawal fee and eventually the minimum balance exception.

Test the Current Account by withdrawing a large amount to trigger the overdraft fee and eventually the overdraft limit exception.

Get Statement (File I/O): Choosing this option will create a text file (e.g., 10000001_transactions.txt) in the project directory containing a full history of the transactions.