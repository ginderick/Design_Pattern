package PrototypePattern

fun main(args: Array<String>) {

    val square = Square(5,6)
    square.draw()

    val squareClone = square.cloneObject()
    squareClone.draw()
}