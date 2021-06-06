package FactoryPattern.Factory

class AnimalFactory {

    companion object {
        fun getAnimal(type: AnimalType): Animal {
            return when(type) {
                AnimalType.DOG -> Dog()
                AnimalType.CAT -> Cat()
                AnimalType.LION -> Lion()
                AnimalType.TIGER -> Tiger()
            }
        }
    }
}