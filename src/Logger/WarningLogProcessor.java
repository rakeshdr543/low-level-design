package Logger;

public class WarningLogProcessor extends  LogProcessor{
    public WarningLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void processLog(int level, String msg) {
        if (level == Warning) {
            System.out.println("Warning: " + msg);
        } else {
            super.processLog(level, msg);
        }
    }
}
