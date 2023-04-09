package com.project11.logger;

public class LoggingConfig {

    private LoggingLevel baseLevel;

    private static  LoggingConfig INSTANCE = new LoggingConfig();


    private LoggingConfig() {}

    /*SingleTone Patern*/

    public static LoggingConfig getINSTANCE() {
        return INSTANCE;
    }

    public LoggingLevel getBaseLevel() {
        return baseLevel;
    }

    public void setBaseLevel(LoggingLevel baseLevel) {
        this.baseLevel = baseLevel;
    }
}
