object LoggerManager {
    fun getLogger(name: String): Logger{
        return Logger(name)
    }
}