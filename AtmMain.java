
public class AtmMain {
    public static void main(String[] args) {
        // Create a Bank object
        Bank bank = new Bank(2);

        // Create AccountHolder objects
        AccountHolder accountHolder1 = new AccountHolder("user1", "1234");
        AccountHolder accountHolder2 = new AccountHolder("user2", "5678");

        // Create Account objects
        Account account1 = new Account("123456789");
        Account account2 = new Account("987654321");

        // Add account holders and accounts to the bank
        bank.addAccountHolder(0, accountHolder1);
        bank.createAccount(0, account1);
        bank.addAccountHolder(1, accountHolder2);
        bank.createAccount(1, account2);

        // Create an ATM object and start the ATM system
        ATM atm = new ATM(bank);
        atm.start();
    }
}
