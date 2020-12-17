package cn.loberty.designPatternX.pesponsibility

/**
 * Create by WangChen on 2020/12/17
 *
 */

fun main() {
    val logger = getChainOfLoggers()
    logger.logMessage(AbstractLogger.INFO, "This is an information.");
    logger.logMessage(AbstractLogger.DEBUG,"This is a debug level information.");
    logger.logMessage(AbstractLogger.ERROR,"This is an error information.");
}


fun getChainOfLoggers() : AbstractLogger{
    val errorLogger = ErrorLogger()
    val fileLogger = FileLogger()
    val consoleLogger = ConsoleLogger()
    errorLogger.nextLogger = fileLogger
    fileLogger.nextLogger = consoleLogger
    return errorLogger
}