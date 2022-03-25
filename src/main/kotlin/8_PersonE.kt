//Konstruktor tambahan bisa didefinisikan lebih dari satu.
//Contoh kode program :
class PersonE {
    var firstName: String
    var lastName: String
    var age: Int = 25
    constructor(_firstName: String, _lastName: String){
        firstName = _firstName
        lastName = _lastName
    }
    constructor(_firstName: String, _lastName: String, _age: Int ):this(_firstName, _lastName){
        age = _age
    }
    fun cetakInfo(){
        println("Name : ${firstName} ${lastName}")
        println("Age : ${age}")
    }
}
fun main(){
    val anton = PersonE ("jamal", "udin")
    anton.cetakInfo()
    println()
    val budi = PersonE ("budi", "gunawan", 21)
    budi.cetakInfo()
}