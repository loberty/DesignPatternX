package cn.loberty.designPatternX.factory

/**
 * Create by WangChen on 2020/12/17
 *
 */

fun main() {
    val shapeFactory = ShapeFactory()

    val shape1 = shapeFactory.getShape("CIRCLE")
    shape1.draw()

    val shape2 = shapeFactory.getShape("RECTANGLE")
    shape2.draw()

    val shape3 = shapeFactory.getShape("SQUARE")
    shape3.draw()

    val shape4 = shapeFactory.getShape("XXX")
    shape4.draw()
}