package Logger;

public class InfoLogProcessor extends  LogProcessor{
    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void processLog(int level, String msg) {
        if (level == Info) {
            System.out.println("Info: " + msg);
        } else {
            super.processLog(level, msg);
        }
    }
}
