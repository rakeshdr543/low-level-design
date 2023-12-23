package Atm.State;

import Atm.AtmCard;
import Atm.Atm;
import Atm.Withdrawal.CashWithdrawalProcessor;
import Atm.Withdrawal.FiveHundredNoteProcessor;
import Atm.Withdrawal.HundredNoteProcessor;
import Atm.Withdrawal.TwoThousandNoteProcessor;

public class WithdrawalState extends AtmState {

    public void withdraw(Atm atm, AtmCard card, int amount) {

        if(amount > card.getBankAccount().getBalance()){
            System.out.println("Insufficient funds in your account");
            return;
        }

        if(amount > atm.getBalance()){
            System.out.println("Insufficient funds in ATM");
            return;
        }

        CashWithdrawalProcessor cashWithdrawalProcessor = new TwoThousandNoteProcessor(new FiveHundredNoteProcessor(new HundredNoteProcessor(null)));
        cashWithdrawalProcessor.withdraw(amount);
        atm.deductBalance( amount);
        card.getBankAccount().deductBalance( amount);
        System.out.println("Amount withdrawn successfully");
        atm.setCurrentState(new IdleState());




    }

}
