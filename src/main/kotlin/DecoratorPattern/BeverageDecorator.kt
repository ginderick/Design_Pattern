package DecoratorPattern

abstract class BeverageDecorator(protected var beverage: Beverage): Beverage {


    override fun getCost(): Int {
        return this.beverage.getCost()
    }

    override fun getDescription(): String {
        return this.beverage.getDescription()
    }
}