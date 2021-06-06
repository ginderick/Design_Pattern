package ObserverPattern.Exercise

import java.util.*

class StockExchange: Subject {

    private var price: Float = 100f
    private var random: Random = Random()
    private var observers = mutableListOf<Observer>()

    override fun addObserver(o: Observer) {
        observers.add(o)
    }

    override fun notifyAllObservers() {
        for (observer in observers) {
            observer.update(price)
        }
    }

    fun start() {
        while (true) {
            try {
                Thread.sleep(500)
            }catch (e: InterruptedException) {
               e.printStackTrace()
            }

            price = price + 2 * random.nextFloat() -1
            notifyAllObservers()
            println(price)
        }
    }



}