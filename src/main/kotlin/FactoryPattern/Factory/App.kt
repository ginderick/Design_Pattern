package FactoryPattern.Factory

fun main(args: Array<String>) {

    val animal = AnimalFactory.getAnimal(AnimalType.DOG)
    animal.eat()
}