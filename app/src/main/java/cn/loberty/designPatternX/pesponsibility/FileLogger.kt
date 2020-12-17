package cn.loberty.designPatternX.pesponsibility

/**
 * Create by WangChen on 2020/12/17
 *
 */
class FileLogger : AbstractLogger(level = DEBUG) {
    override fun write(message: String?) {
        println("File::Logger: $message")
    }
}