package fox.spiteful.avaritia;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Lumberjack {

    private static Logger logger = LogManager.getLogger("Avaritia");

    /**
     * @param info - String to log to the info level
     */

    public static void info(Object info) {
        logger.info(info);
    }

    /**
     * @param warn - String to log to the warn level
     */

    public static void warn(Object warn) {
        logger.warn(warn);
    }

    /**
     * @param error - String to log to the error level
     */

    public static void error(Object error) {
        logger.error(error);
    }

    /**
     * @param debug - String to log to the debug level
     */

    public static void debug(Object debug) {
        logger.debug(debug);
    }

    public static Logger getLogger() {
        return logger;
    }
}