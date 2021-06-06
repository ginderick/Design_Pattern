package FactoryPattern.AbstractFactory

interface  AbstractFactory {
    fun getCar(type: String): Car?
}