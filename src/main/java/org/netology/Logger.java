package org.netology;

public class Logger {
    protected int num = 1;
    private static Logger instance;

    private Logger() {
    }

    public void log(String msg) {
        System.out.println("[" + num++ + "]" + msg);
    }

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }
}
