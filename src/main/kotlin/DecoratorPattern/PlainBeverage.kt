package DecoratorPattern

class PlainBeverage(): Beverage {

    override fun getCost(): Int {
        return 5
    }

    override fun getDescription(): String {
        return "Plain beverage"
    }
}