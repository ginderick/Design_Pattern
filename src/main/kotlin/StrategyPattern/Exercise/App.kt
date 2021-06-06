package StrategyPattern.Exercise

import java.awt.Image

fun main(args: Array<String>) {
    val manager = ImageManager()
    manager.setStrategy(LaptopRenderer())
    manager.execute()
}