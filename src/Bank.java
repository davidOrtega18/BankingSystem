import java.util.ArrayList;
import java.util.List;

public class Bank<T extends Account> {
    private List<T> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(T account) {
        accounts.add(account);
    }

    public double getTotalBalance() {
        double totalBalance = 0;
        for (T account : accounts) {
            totalBalance += account.getBalance();
        }
        return totalBalance;
    }

    public void performTransaction(T account, double amount) {
        try {
            Transaction<T> transaction = new Transaction<>(account, amount);
            transaction.execute();
        } catch (Exception e) {
            System.out.println("Transaction failed. " + e.getMessage());
        }
    }
}
