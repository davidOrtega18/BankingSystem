public class Transaction<T extends Account> {
    private T account;
    private double amount;

    public Transaction(T account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void execute() {
        try {
            if (amount > 0) {
                account.deposit(amount);
                System.out.println("Deposit: $" + amount);
            } else if (amount < 0) {
                account.withdraw(Math.abs(amount));
                System.out.println("Withdrawal: $" + Math.abs(amount));
            } else {
                System.out.println("Transaction failed. Invalid amount.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Transaction failed. " + e.getMessage());
        } catch (InsufficientFundsException e) {
            throw new RuntimeException(e);
        }
    }
}
