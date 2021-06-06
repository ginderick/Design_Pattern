package PrototypePattern

abstract class Shape(width: Int, height: Int) {

    var width: Int? = width
    var height: Int? = height


    abstract fun draw()
    abstract fun cloneObject(): Shape

}