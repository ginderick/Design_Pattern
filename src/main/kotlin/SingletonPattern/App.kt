package SingletonPattern

fun main(args: Array<String>) {

    var o1 = Database.INSTANCE
    var o2 = Database.INSTANCE

    if (o1 == o2) {
        print("Same objects")
    }

}