package FactoryPattern.AbstractFactory

class ElectricCarFactory: AbstractFactory {

    override fun getCar(type: String): Car? {
        return when(type) {
            "FORD" -> ElectricFord()
            "TOYOTA" -> ElectricToyota()
            else -> null
        }
    }
}