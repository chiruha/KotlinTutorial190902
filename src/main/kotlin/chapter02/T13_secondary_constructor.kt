package chapter02

fun main() {
    val user = MyUser2("hello")
    val user1 = MyUser2()
}

class MyUser2{
    constructor()
    constructor(name: String, age: Int)
    constructor(name: String) {
        println("hello constructor $name")
    }
    init {
        println("hello init block")
    }

}