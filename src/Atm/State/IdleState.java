package Atm.State;


import Atm.AtmCard;
import Atm.Atm;

public class IdleState extends  AtmState {

    public void insertCard(Atm atm, AtmCard card) {
        System.out.println("Card inserted");
        atm.setCurrentState( new HasCardState());
    }
}
