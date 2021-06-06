package ObserverPattern.Example


fun main(args: Array<String>) {
    var station = WeatherStation()
    var weatherObserver = WeatherObserver(station)

    station.addObserver(weatherObserver)
    station.pressure = 10
    station.humidity = 20
    station.temperature = 30

}