package Atm.State;

import Atm.AtmCard;
import Atm.BankAccount;

public class BalanceCheckState extends AtmState {



    public void balanceCheck( AtmCard card){
        BankAccount bankAccount = card.getBankAccount();
System.out.println("Balance: " + bankAccount.getBalance());

    }
}
