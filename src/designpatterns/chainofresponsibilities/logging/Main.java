package chainofresponsibilities.logging;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.INFO, "Logging Info for method");
        logProcessor.log(LogProcessor.DEBUG, "Need to debug this");
        logProcessor.log(LogProcessor.ERROR, "Exception Occurred");
        logProcessor.log(5, "Exception Occurred");
    }
}
