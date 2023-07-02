import java.util.Scanner;

// Class representing an ATM
public class ATM {
    private Bank bank;
    private Account currentAccount;

    public ATM(Bank bank) {
        this.bank = bank;
        this.currentAccount = null;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();

        System.out.print("Enter User PIN: ");
        String userPin = scanner.nextLine();

        // Authenticate the user
        if (authenticateUser(userId, userPin)) {
            System.out.println("Authentication successful!");
            showMenu();
        } else {
            System.out.println("Authentication failed!");
        }
    }

    private boolean authenticateUser(String userId, String userPin) {
        Account account = bank.getAccountByUserId(userId);
        // System.out.println(account.get);

        // Check if the user account exists and the PIN matches
        if (account != null && bank.getAccountHolderByUserId(userId).getUserPin().equals(userPin)) {
            // if (account != null && account.getAccountHolder().getUserPin().equals(userPin)) {
            currentAccount = account;
            return true;
        }
        return false;
    }

    private void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Show Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. CurrentBalancee");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    bank.showTransactionHistory(currentAccount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline character
                    currentAccount.withdraw(withdrawAmount);
                    bank.addTransaction(new BankTransaction(currentAccount, "Withdraw", withdrawAmount));
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline character
                    currentAccount.deposit(depositAmount);
                    bank.addTransaction(new BankTransaction(currentAccount, "Deposit", depositAmount));
                    break;
                case 4:
                    System.out.print("Enter destination account number: ");
                    String destinationAccountNumber = scanner.nextLine();
                    System.out.print("Enter transfer amount: ");
                    double transferAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline character
                    Account destinationAccount = bank.getAccountByUserId(destinationAccountNumber);
                    if (destinationAccount != null) {
                        currentAccount.transfer(destinationAccount, transferAmount);
                        bank.addTransaction(new BankTransaction(currentAccount, "Transfer", transferAmount));
                    } else {
                        System.out.println("Invalid destination account!");
                    }
                    break;
                case 5:
                    System.out.println("The current balance is "+currentAccount.getBalance());
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
        System.out.println("Thank you for using the ATM. Goodbye!");
    }
}