package cn.loberty.designPatternX.pesponsibility

/**
 * Create by WangChen on 2020/12/17
 *
 */
class ConsoleLogger : AbstractLogger(level = INFO) {
    override fun write(message: String?) {
        println("Console::Logger: $message")
    }
}