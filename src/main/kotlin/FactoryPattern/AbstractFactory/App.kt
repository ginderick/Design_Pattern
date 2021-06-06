package FactoryPattern.AbstractFactory



    fun main(args: Array<String>) {
        val factory = FactoryProducer.getFactory("PETROL")
        factory?.getCar("FORD")?.assemble()
    }
