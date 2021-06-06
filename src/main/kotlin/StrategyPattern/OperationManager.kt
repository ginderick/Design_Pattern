package StrategyPattern


//abstract layer between high level modules and low level modules
class OperationManager {

    private lateinit var  strategy: Strategy

    fun setStrategy(strategy: Strategy) {
        this.strategy = strategy
    }

    fun execute(num1: Int, num2: Int) {
        this.strategy.execute(num1, num2)
    }
}