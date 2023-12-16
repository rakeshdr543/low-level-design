package Logger;

public class ErrorLogProcessor extends  LogProcessor{
    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void processLog(int level, String msg) {
        if (level == Error) {
            System.out.println("Error: " + msg);
        } else {
            super.processLog(level, msg);
        }
    }
}
