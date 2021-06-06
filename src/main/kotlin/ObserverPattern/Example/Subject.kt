package ObserverPattern.Example

interface Subject {
    fun addObserver(o: Observer)
    fun removeObserver(o: Observer)
    fun notifyAllObservers()
}