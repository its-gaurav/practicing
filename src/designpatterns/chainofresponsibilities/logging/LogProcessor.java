package chainofresponsibilities.logging;

public abstract class LogProcessor {

    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;


    public abstract void log(int logLevel, String message);
}
