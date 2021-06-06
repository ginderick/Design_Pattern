package FlyweightPattern

import java.awt.Color

class Rectangle(
    var color: String,
) : Shape {

    var x: Int? = null
        get() = field
        set(value) {
            field = value
        }
    var y: Int? = null
        get() = field
        set(value) {
            field = value
        }

    override fun draw() {
        println("Drawing a rectangle $color  x= $x y= $y")
    }
}