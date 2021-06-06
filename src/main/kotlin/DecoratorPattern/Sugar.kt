package DecoratorPattern

class Sugar(beverage: Beverage): BeverageDecorator(beverage) {

    override fun getCost(): Int {
        return this.beverage.getCost() + 1
    }

    override fun getDescription(): String {
        return this.beverage.getDescription() + " sugar"
    }
}