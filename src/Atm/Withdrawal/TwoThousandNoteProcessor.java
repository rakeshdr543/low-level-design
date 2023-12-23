package Atm.Withdrawal;

public class TwoThousandNoteProcessor extends CashWithdrawalProcessor{

    public TwoThousandNoteProcessor(CashWithdrawalProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

        public void withdraw(int amount) {
            int numberOfNotes = amount / 2000;
            int pendingAmount = amount % 2000;
            if (numberOfNotes > 0) {
                System.out.println("Dispensing " + numberOfNotes + " notes of 2000");
            }
            if (pendingAmount > 0 && nextProcessor != null) {
                nextProcessor.withdraw(pendingAmount);
            }
        }
}
