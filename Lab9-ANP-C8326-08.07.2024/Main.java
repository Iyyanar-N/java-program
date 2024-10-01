import java.util.ArrayList;
import java.util.List;

// Interface Account
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double viewBalance();
}

// Class Bank
class Bank {
    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}

// Class SavingsAccount
class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    public double viewBalance() {
        return balance;
    }

    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Class CurrentAccount
class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance and overdraft limit");
        }
    }

    public double calculateInterest() {
        return 0; // Current accounts do not earn interest
    }

    public double viewBalance() {
        return balance;
    }

    public void displayCurrentAccountDetails() {
        System.out.println("Current Account Balance: " + balance);
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("XYZ Bank");

        SavingsAccount savingsAccount = new SavingsAccount(1000, 5);
        CurrentAccount currentAccount = new CurrentAccount(500, 1000);

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        savingsAccount.displaySavingsAccountDetails();
        currentAccount.displayCurrentAccountDetails();
    }
}