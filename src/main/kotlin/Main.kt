fun main() {
    DatabaseConnection.url ="mysql//http"
    DatabaseConnection.connect()

    val myObject = object : Runnable{
        override fun run() {
            println("Hello it's myObject")
        }
    }
    myObject.run()

    val logger = LoggerManager.getLogger("Vlad")
    logger.printLog()

    val listLine = listOf("cat", "dog", "elephant", "lion")
    val listFiltered = listLine.filter { it.length < 5 }
    println(listFiltered)

    val listNumber = listOf(1,2,3,4,5,6)
    val listWorld = listNumber.map {turnNumberIntoWorld(it)}
    println(listWorld)
}
fun turnNumberIntoWorld(number: Int): String{
    return when(number){
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "Different"
    }
}