package StrategyPattern.Exercise

class ImageManager {

    private lateinit var strategy: Strategy

    fun setStrategy(strategy: Strategy) {
        this.strategy = strategy
    }

    fun execute() {
        this.strategy.execute()
    }
}