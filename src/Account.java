public class Account {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        assert amount > 0.0;
         balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        assert amount > 0.0;
        if(amount > balance){
        throw new InsufficientFundsException();
        }

           balance -= amount;
    }

    public String toString(){
        String stg = "Account Number: " + accountHolder +
                    " Account holder: " + accountHolder +
                    "Balance: " + balance;

        return stg;
    }








}
