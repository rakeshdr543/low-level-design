package Atm.Withdrawal;

public class FiveHundredNoteProcessor extends CashWithdrawalProcessor{

    public FiveHundredNoteProcessor(CashWithdrawalProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

        public void withdraw(int amount) {
            int numberOfNotes = amount / 500;
            int pendingAmount = amount % 500;
            if (numberOfNotes > 0) {
                System.out.println("Dispensing " + numberOfNotes + " notes of 500");
            }
            if (pendingAmount > 0 && nextProcessor != null) {
                nextProcessor.withdraw(pendingAmount);
            }
        }
}
