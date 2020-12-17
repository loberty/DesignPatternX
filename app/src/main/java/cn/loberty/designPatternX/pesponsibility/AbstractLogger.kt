package cn.loberty.designPatternX.pesponsibility

/**
 * Create by WangChen on 2020/12/17
 *
 */
abstract class AbstractLogger(var level: Int) {

    companion object{
        const val INFO = 1
        const val DEBUG = 2
        const val ERROR = 3
    }
    //    //责任链中的下一个元素

    var nextLogger : AbstractLogger? = null

    open fun logMessage(level: Int, message: String?) {
        if (this.level <= level) {
            write(message)
        }
        nextLogger?.logMessage(level, message)
    }

    protected abstract fun write(message: String?)
}