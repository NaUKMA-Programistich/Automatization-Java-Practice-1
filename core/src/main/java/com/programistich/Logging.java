package com.programistich;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {

    private static final Logger logger = LogManager.getLogger(Logging.class);

    public static void info(String msg) {
        System.out.println(msg);
    }

    public static void error(Exception exception) {
        logger.error(exception.getMessage());
    }
}