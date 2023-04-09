package com.project11.logger;

public abstract class AbstractLogeer {

    protected  String className;
    protected LoggingLevel baseLevel = LoggingConfig.getINSTANCE().getBaseLevel();

    public AbstractLogeer(String className) {
        this.className = className;

    }

    protected  abstract  void  outputMessage(LoggingLevel level, String message );

    public  void log(LoggingLevel level, String message){
        if (baseLevel.ordinal() <= level.ordinal()) {
            message = String.format("[%s][%s]; %s", className, level, message);
            System.out.println(message);
        }
    }

    public  void debug(String message){
        log(LoggingLevel.DEBUG, message);
    }

    public  void info(String message){
        log(LoggingLevel.INFO, message);
    }

    public  void warn(String message){
        log(LoggingLevel.WARN, message);
    }

    public  void error(String message){
        log(LoggingLevel.ERROR, message);
    }

    public  void fatal(String message){
        log(LoggingLevel.FATAL, message);
    }
}
