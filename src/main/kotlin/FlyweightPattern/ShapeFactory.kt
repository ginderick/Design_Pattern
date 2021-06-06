package FlyweightPattern

class ShapeFactory {

    //create rectangle for every color
    private var shapes: HashMap<String, Shape> = HashMap()

    fun getShape(color: String): Shape {
        if (shapes.containsKey(color)) {
            return shapes.get(color)!!
        }

        println("Create a new rectangle")
        val shape = Rectangle(color)
        shapes.put(color, shape)
        return shape
    }

}