package DecoratorPattern

fun main(args: Array<String>) {

    val b: Beverage = Sugar(Milk(PlainBeverage()))
    println(b.getCost())
    println(b.getDescription())
}