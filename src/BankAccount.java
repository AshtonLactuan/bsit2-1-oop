class BankAccount {
    static String bankName = "Liceo Bank";
    static double interestRate = 0.03;
    static int totalAccounts = 0;

    String accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(String accountHolderName, double initialBalance) {
        totalAccounts++;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.accountNumber = generateAccountNumber();
        System.out.println("Account Created: " + accountNumber + " for " + accountHolderName + " with initial balance: $" + initialBalance);
    }

    static String generateAccountNumber() {
        return "ACC" + String.format("%03d", totalAccounts);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolderName + " deposited $" + amount + ". New balance: $" + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(accountHolderName + " withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println(accountHolderName + " attempted to withdraw $" + amount + ". Insufficient balance.");
        }
    }

    double calculateInterest() {
        return balance * interestRate;
    }

    void displayAccountInfo() {
        System.out.println(accountHolderName + "'s interest: $" + calculateInterest());
    }
}

