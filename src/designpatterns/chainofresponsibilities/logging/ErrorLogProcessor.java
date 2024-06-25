package chainofresponsibilities.logging;

public class ErrorLogProcessor extends LogProcessor {

    private final LogProcessor nextLogProcessor;

    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    @Override
    public void log(int logLevel, String message) {
        if (ERROR == logLevel) {
            System.out.println("ERROR: "+message);
        } else {
            throw new RuntimeException("Not A Valid Log Level");
        }
    }
}
