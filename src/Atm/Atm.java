package Atm;

import Atm.State.AtmState;
import Atm.State.IdleState;

public class Atm {
    private static  Atm atmObject = new Atm();
    private AtmState currentState;
    private float balance;
    int noOfTwoThousandNotes;
int noOfFiveHundredNotes;
int noOfHundredNotes;

    private Atm() {

    }

    public static Atm getInstance() {
        atmObject.setCurrentState(new IdleState());
        return atmObject;
    }

    public float getBalance() {
        return balance;
    }

    public AtmState getCurrentState() {
        return currentState;
    }


    public void setCurrentState(AtmState currentState) {
        this.currentState = currentState;
    }

    public void printBalance() {
        System.out.println("Balance: " + balance);
    }

    public void deductBalance(float amount) {
        balance -= amount;
    }

    public void setBalance(float balance, int noOfTwoThousandNotes, int noOfFiveHundredNotes, int noOfHundredNotes) {
        this.balance = balance;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfHundredNotes = noOfHundredNotes;
    }
}
