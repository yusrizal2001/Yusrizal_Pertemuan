//Berikut contoh kode program kelas
//person yang memiliki konstruktor tambahan tidak memiliki konstuktor utama
//Berikut kode programnya :
class PersonD {
    var firstName: String
    var lastName: String
    var age: Int
    constructor(_firstName: String, _lastName: String, _age: Int){
        firstName= _firstName
        lastName= _lastName
        age= _age

    }
}
fun main(){
    val budi = PersonD ("Budi", "Gunawan", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}