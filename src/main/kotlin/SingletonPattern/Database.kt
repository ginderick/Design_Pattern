package SingletonPattern

enum class Database {

    //acquiring the instance is thread safe
    INSTANCE;

    fun connect() {
        print("Connecting")
    }

    fun disconnect() {
        print("Disconnecting")
    }
}