package FactoryPattern.AbstractFactory

class PetrolCarFactory: AbstractFactory {

    override fun getCar(type: String): Car? {
        return when(type) {
            "FORD" -> PetrolFord()
            "TOYOTA" -> PetrolToyota()
            else -> null
        }
    }
}