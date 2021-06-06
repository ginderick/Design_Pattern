package BuilderPattern

fun main(args: Array<String>) {

    val student = Student.Builder("Gin", "IIT")
        .build()


    println(student)
}