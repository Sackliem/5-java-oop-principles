package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Logger logger = new Logger("test1", LogLevel.DEBUG);
        logger.setLevel(LogLevel.DEBUG);
        logger.setHandler(new ConsoleHandler());
        logger.debug("test2");
        logger.error("test3");
    }
}
