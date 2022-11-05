data class Person(val firstName: String, val familyName: String, val age: Int) {
    val fullName = "$firstName $familyName"
    
    fun displayInfo() {
        println("$fullName 님의 나이는 $age 세입니다.")
    }
}

fun main(args: Array<String>) {
    var person = Person("황", "수민", 22)
    
    person.displayInfo()
}