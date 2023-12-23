package Atm.State;

import Atm.Atm;
import Atm.AtmCard;
import Atm.OperationType;


public abstract class AtmState {
    public void insertCard(Atm atm, AtmCard card) {
        System.out.println("Oops, Something went wrong");
    }

    public void authenticatePin(Atm atm, AtmCard card, String pin) {
        System.out.println("Oops, Something went wrong");
    }

    public void selectOperation(Atm atm,  OperationType operation) {
        System.out.println("Oops, Something went wrong");
    }

    public void withdraw(Atm atm, AtmCard card, int amount) {
        System.out.println("Oops, Something went wrong");
    }

    public void balance(Atm atm, AtmCard card) {
        System.out.println("Oops, Something went wrong");
    }

    public void ejectCard(Atm atm) {
        System.out.println("Oops, Something went wrong");
    }

    public void exit(Atm atm ) {
        System.out.println("Oops, Something went wrong");
    }
}
