class Person{
    private var timName : String
    init {
        println("Selamat Datang")
    }

    constructor(namaTim : String) {
        timName = namaTim
        someInteger += someInteger
    }

    fun main2(){
        println("Tim Kami '$timName'")
    }

    companion object Test {
        var someInteger: Int = 10
        fun callMe() = println("Angka Yang Akan Muncul Adalah")
    }
}

fun main() {
    Person.callMe()
    println(Person.someInteger)

    val objClass = Person("Team 4")
    objClass.main2()
}