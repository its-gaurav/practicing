package chainofresponsibilities.logging;

public class InfoLogProcessor extends LogProcessor{

    private final LogProcessor nextLogProcessor;

    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super();
        this.nextLogProcessor = nextLogProcessor;
    }

    @Override
    public void log(int logLevel, String message) {
        if (INFO == logLevel) {
            System.out.println("INFO: "+message);
        } else {
            this.nextLogProcessor.log(logLevel, message);
        }
    }
}
