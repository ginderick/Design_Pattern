package StrategyPattern

fun main(args: Array<String>) {

    val manager = OperationManager()
    manager.setStrategy(Division())
    manager.execute(10,5)
}