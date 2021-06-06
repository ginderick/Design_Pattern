package ObserverPattern.Example

class WeatherObserver(
    var subject: Subject
) : Observer {

    private var pressure: Int = 0
    private var temperature: Int = 0
    private var humidity: Int = 0

    override fun update(pressure: Int, temperature: Int, humidity: Int) {
        this.pressure = pressure
        this.temperature = temperature
        this.humidity = humidity

        showData()
    }

    private fun showData() {
        println("Pressure: $pressure, Temperature: $temperature, Humidity: $humidity")
    }
}