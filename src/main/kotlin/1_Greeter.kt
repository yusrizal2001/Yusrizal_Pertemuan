class `1_Greeter` {
    var text: String =""
    fun greet() {
        println("Hello Perkenalkan Nama Saya!")
    }
    fun greet(name: String){
        println("$text $name")
    }
    fun with_ret_val(name: String): String {
        return "$text $name"
    }
}