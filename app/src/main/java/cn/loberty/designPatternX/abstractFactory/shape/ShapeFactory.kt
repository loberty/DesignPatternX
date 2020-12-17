package cn.loberty.designPatternX.abstractFactory.shape

import cn.loberty.designPatternX.abstractFactory.AbstractFactory
import cn.loberty.designPatternX.abstractFactory.color.Color
import java.util.*

/**
 * Create by WangChen on 2020/12/17
 *
 */
class ShapeFactory : AbstractFactory() {

    override fun getColor(color: String): Color {
        TODO("Not yet implemented")
    }

    override fun getShape(shapeType: String) : Shape {
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