// Class representing an Account
public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void transfer(Account destinationAccount, double amount) {
        if (amount <= balance) {
            balance -= amount;
            destinationAccount.deposit(amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}