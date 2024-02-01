class DatabaseConnection{
    companion object{
        var url: String =""
        fun connect(){
            println("Connect to database at $url")
        }
    }
}