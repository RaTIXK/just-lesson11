package com.project11.logger;

public class CommandLineLoger extends AbstractLogeer {


    public CommandLineLoger(String classname/*, LogingLevel baseLevel*/) {
        super(classname/*, baseLevel*/);
    }

    @Override
    protected void outputMessage(LoggingLevel level, String message) {

        if (LoggingLevel.ERROR.ordinal() <= level.ordinal()) {
            {
                System.err.println(message);
            }

            System.out.printf("[%s]; %s", level, message);

        }
    }
}