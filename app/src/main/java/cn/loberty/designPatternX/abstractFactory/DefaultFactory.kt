package cn.loberty.designPatternX.abstractFactory

import cn.loberty.designPatternX.abstractFactory.color.Color
import cn.loberty.designPatternX.abstractFactory.shape.Shape

/**
 * Create by WangChen on 2020/12/17
 *
 */
class DefaultFactory : AbstractFactory() {
    override fun getColor(color: String): Color {
        TODO("Not yet implemented")
    }

    override fun getShape(shape: String): Shape {
        TODO("Not yet implemented")
    }
}