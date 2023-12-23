package Atm;

public class AtmCard {
     String cardNumber;
     String pin;
     BankAccount account;

    public AtmCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public BankAccount getBankAccount() {
        return account;
    }


}
