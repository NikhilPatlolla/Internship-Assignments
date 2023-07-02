// Class representing a Bank Transaction
public class BankTransaction {
    private Account account;
    private String transactionType;
    private double amount;

    public BankTransaction(Account account, String transactionType, double amount) {
        this.account = account;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public Account getAccount() {
        return account;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }
}