package cn.loberty.designPatternX.pesponsibility

/**
 * Create by WangChen on 2020/12/17
 *
 */
class ErrorLogger : AbstractLogger(level = ERROR) {
    override fun write(message: String?) {
        println("Error::Logger: $message")
    }
}