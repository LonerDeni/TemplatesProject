package Singleton;

import java.sql.Timestamp;

public class Logger {
    protected int num = 1;
    private static Logger logger = null;

    private Logger() {
    }

    public void log(String msg) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("[" + timestamp + " " + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (logger == null)
            logger = new Logger();
        return logger;
    }

}