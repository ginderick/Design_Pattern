package FlyweightPattern

import java.util.*


class FlyweightSimulator {

    private var colors = arrayListOf("RED", "GREEN", "BLUE")
    private var shapeFactory = ShapeFactory()
    private var random = Random()

    fun run() {
        for (i in 0..30) {
            var rectangle: Rectangle = shapeFactory.getShape(getRandomColor()) as Rectangle
            rectangle.x = getRandomCoordinate()
            rectangle.y = getRandomCoordinate()
            rectangle.draw()
        }
    }

    private fun getRandomColor(): String {
        return colors[random.nextInt(colors.size)]
    }

    private fun getRandomCoordinate(): Int {
        return random.nextInt(50)
    }

}