package ObserverPattern.Exercise

interface Subject {



    fun addObserver(o: Observer)
    fun notifyAllObservers()


}