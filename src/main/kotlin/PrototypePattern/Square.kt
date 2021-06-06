package PrototypePattern

class Square(width: Int, height: Int) : Shape(width, height) {
    override fun draw() {
        println("Square $width, $height")
    }

    override fun cloneObject(): Shape {
        return Square(width!!, height!!)
    }

}