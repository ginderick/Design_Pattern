package ObserverPattern.Example

class WeatherStation : Subject {

    var pressure: Int = 0
        set(value) {
            field = value
            notifyAllObservers()
        }
    var temperature: Int = 0
        set(value) {
            field = value
            notifyAllObservers()
        }
    var humidity: Int = 0
        set(value) {
            field = value
            notifyAllObservers()
        }
    private var observerList = mutableListOf<Observer>()

    override fun addObserver(o: Observer) {
        observerList.add(o)
    }

    override fun removeObserver(o: Observer) {
        observerList.remove(o)
    }

    override fun notifyAllObservers() {
        for (observer in observerList) {
            observer.update(pressure, temperature, humidity)
        }
    }
}