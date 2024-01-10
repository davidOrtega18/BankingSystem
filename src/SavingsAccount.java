public class SavingsAccount extends Account{
    private double interestRate;
    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate(){
        return interestRate;
    }





}
