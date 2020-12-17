package cn.loberty.designPatternX.abstractFactory.color

import cn.loberty.designPatternX.abstractFactory.AbstractFactory
import cn.loberty.designPatternX.abstractFactory.shape.Shape
import java.util.*

/**
 * Create by WangChen on 2020/12/17
 *
 */
class ColorFactory : AbstractFactory() {
    override fun getColor(color : String) : Color{
        when(color.toUpperCase(Locale.ROOT)) {
            "RED" -> {
                return Red()
            }
            ("yellow") -> {
                return Yellow()
            }
        }
        return Trans()
    }

    override fun getShape(shape: String): Shape {
        TODO("Not yet implemented")
    }
}