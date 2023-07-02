// Class representing a Bank
public class Bank {
    private AccountHolder[] accountHolders;
    private Account[] accounts;
    private BankTransaction[] transactions;
    private int transactionCount;

    public Bank(int numAccounts) {
        accountHolders = new AccountHolder[numAccounts];
        accounts = new Account[numAccounts];
        transactions = new BankTransaction[numAccounts * 100]; // Assuming at most 100 transactions per account
        transactionCount = 0;
    }

    public void addAccountHolder(int index, AccountHolder accountHolder) {
        accountHolders[index] = accountHolder;
    }

    public void createAccount(int index, Account account) {
        accounts[index] = account;
    }

    public void addTransaction(BankTransaction transaction) {
        transactions[transactionCount] = transaction;
        transactionCount++;
    }

    public Account getAccountByUserId(String userId) {
        for (int i = 0; i < accountHolders.length; i++) {
            if (accountHolders[i].getUserId().equals(userId)) {
                return accounts[i];
            }
        }
        return null;
    }

    public AccountHolder getAccountHolderByUserId(String userId) {
        for (int i = 0; i < accountHolders.length; i++) {
            if (accountHolders[i].getUserId().equals(userId)) {
                return accountHolders[i];
            }
        }
        return null;
    }

    public void showTransactionHistory(Account account) {
        System.out.println("Transaction History for Account: " + account.getAccountNumber());
        for (int i = 0; i < transactionCount; i++) {
            BankTransaction transaction = transactions[i];
            if (transaction.getAccount() == account) {
                System.out.println("Type: " + transaction.getTransactionType() + ", Amount: " + transaction.getAmount());
            }
        }
    }
}



