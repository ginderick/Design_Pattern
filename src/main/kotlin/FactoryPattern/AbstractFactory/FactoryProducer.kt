package FactoryPattern.AbstractFactory

class FactoryProducer {

    companion object {
        fun getFactory(factory: String): AbstractFactory? {
            return when(factory) {
                "ELECTRIC" -> ElectricCarFactory()
                "PETROL" -> PetrolCarFactory()
                else -> null
            }
        }
    }
}