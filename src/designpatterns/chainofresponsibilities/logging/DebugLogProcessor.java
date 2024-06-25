package chainofresponsibilities.logging;

public class DebugLogProcessor extends LogProcessor {
    private final LogProcessor nextLogProcessor;

    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super();
        this.nextLogProcessor = nextLogProcessor;
    }

    @Override
    public void log(int logLevel, String message) {
        if (DEBUG == logLevel) {
            System.out.println("DEBUG: "+message);
        } else {
            this.nextLogProcessor.log(logLevel, message);
        }
    }
}
