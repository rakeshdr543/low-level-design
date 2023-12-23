package Atm.State;

import Atm.AtmCard;
import Atm.Atm;

public class HasCardState extends  AtmState {

   public void authenticatePin(Atm atm, AtmCard card, String pin) {
       System.out.println("Pin authenticated");
         atm.setCurrentState(new SelectOperationState());

   }
}
