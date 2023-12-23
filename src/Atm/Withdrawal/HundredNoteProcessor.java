package Atm.Withdrawal;

public class HundredNoteProcessor extends CashWithdrawalProcessor{

    public HundredNoteProcessor(CashWithdrawalProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

            public void withdraw(int amount) {
                int numberOfNotes = amount / 100;
                int pendingAmount = amount % 100;
                if (numberOfNotes > 0) {
                    System.out.println("Dispensing " + numberOfNotes + " notes of 100");
                }
                if (pendingAmount > 0 && nextProcessor != null) {
                    nextProcessor.withdraw(pendingAmount);
                }
            }
}
