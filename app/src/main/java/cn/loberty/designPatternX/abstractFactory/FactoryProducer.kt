package cn.loberty.designPatternX.abstractFactory

import cn.loberty.designPatternX.abstractFactory.color.ColorFactory
import cn.loberty.designPatternX.abstractFactory.shape.ShapeFactory
import java.util.*

/**
 * Create by WangChen on 2020/12/17
 *
 */
class FactoryProducer {
    fun getFactory(type : String) : AbstractFactory {
        when (type.toUpperCase(Locale.getDefault())){
            "COLOR" -> return ColorFactory()
            "SHAPE" -> return ShapeFactory()
        }
        return DefaultFactory()
    }
}