public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(101, "David Ortega", 1000, 0.02);
        CheckingAccount checkingAccount = new CheckingAccount(201, "Riberiko", 2000, 500);

        Bank<Account> bank = new Bank<>();

        bank.addAccount(savingsAccount);
        bank.addAccount(checkingAccount);


        System.out.println("Initial Total Balance: $" + bank.getTotalBalance());


        bank.performTransaction(savingsAccount, 500);
        bank.performTransaction(checkingAccount, -300);

        System.out.println("Total Balance after Transactions: $" + bank.getTotalBalance());

        try {
            bank.performTransaction(savingsAccount, -1500);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Final Total Balance: $" + bank.getTotalBalance());
    }
}
