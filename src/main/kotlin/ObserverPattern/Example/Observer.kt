package ObserverPattern.Example

interface Observer {

    fun update(pressure: Int, temperature: Int, humidity: Int)

}
