package Atm;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber,  double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deductBalance(double amount) {
        balance -= amount;
    }


}
