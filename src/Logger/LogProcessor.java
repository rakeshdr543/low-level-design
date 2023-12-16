package Logger;

public abstract class LogProcessor {
    public static int Info=1;
    public static int Warning=2;
    public static int Error=3;

    public LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    public void processLog(int level, String msg) {
        if (nextLogProcessor != null) {
            nextLogProcessor.processLog(level, msg);
        }
    }
}
