package cn.loberty.designPatternX.abstractFactory

/**
 * Create by WangChen on 2020/12/17
 *
 */


fun main() {
    val factoryProducer = FactoryProducer()

    val colorFactory = factoryProducer.getFactory("COLOR")
    val redColor = colorFactory.getColor("RED")
    redColor.fill()
    val yellowColor = colorFactory.getColor("YELLOW")
    yellowColor.fill()

    val shapeFactory = factoryProducer.getFactory("SHAPE")
    val circle = shapeFactory.getShape("CIRCLE")
    circle.draw()
    val squareShape = shapeFactory.getShape("SQUARE")
    squareShape.draw()
}