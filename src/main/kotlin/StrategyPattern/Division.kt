package StrategyPattern

class Division: Strategy {
    override fun execute(num1: Int, num2: Int) {
        println(num1/num2)
    }
}