package Atm.Withdrawal;

public abstract class CashWithdrawalProcessor {
    protected CashWithdrawalProcessor nextProcessor;

    public void setNextProcessor(CashWithdrawalProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract void withdraw(int amount);
}
