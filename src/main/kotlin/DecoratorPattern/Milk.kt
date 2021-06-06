package DecoratorPattern

class Milk(beverage: Beverage): BeverageDecorator(beverage) {

    override fun getCost(): Int {
        return this.beverage.getCost() + 3
    }

    override fun getDescription(): String {
        return this.beverage.getDescription() + " milk"
    }
}