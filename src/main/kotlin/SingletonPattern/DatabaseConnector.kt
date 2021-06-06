package SingletonPattern

class DatabaseConnector private constructor() {

    //lazy version

    companion object {
        var INSTANCE: DatabaseConnector? = null

        fun getInstance(): DatabaseConnector {
            if (INSTANCE == null) {
                synchronized(DatabaseConnector::class.java) {
                    INSTANCE = DatabaseConnector()
                }
            }
            return INSTANCE!!
        }
    }
}