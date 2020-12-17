package cn.loberty.designPatternX.abstractFactory

import cn.loberty.designPatternX.abstractFactory.color.Color
import cn.loberty.designPatternX.abstractFactory.shape.Shape

/**
 * Create by WangChen on 2020/12/17
 *
 */
abstract class AbstractFactory {
    abstract fun getColor(color: String) : Color
    abstract fun getShape(shape : String) : Shape
}