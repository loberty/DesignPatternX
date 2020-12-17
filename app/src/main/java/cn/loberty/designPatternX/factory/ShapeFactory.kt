package cn.loberty.designPatternX.factory

import java.util.*

/**
 * Create by WangChen on 2020/12/17
 *
 */
class ShapeFactory {

    fun getShape(shapeType: String) : Shape{
        when(shapeType.toUpperCase(Locale.ROOT)) {
            "CIRCLE" -> {
                return Circle()
            }
            ("RECTANGLE") -> {
                return Rectangle()
            }
            ("SQUARE") -> {
                return Square()
            }
        }
        return NonShape()
    }
}