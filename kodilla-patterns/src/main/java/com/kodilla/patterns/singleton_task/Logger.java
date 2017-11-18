package com.kodilla.patterns.singleton_task;

public class Logger {
    private static Logger loggerInstance = null;
    private static String lastLog = "";

    public Logger() {
    }

    public static Logger getInstance() {
        if (loggerInstance == null) {
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

    public void log(final String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}
