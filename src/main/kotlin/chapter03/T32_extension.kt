package chapter03

class MySuper {
    val value: Int = 10
    fun mySuperFun() {
        println("mySuperFun")

    }
}

val MySuper.myValue: Int
    get() = 10

fun MySuper.myFun() {
    println("my fun")
}

fun main() {
    val obj = MySuper()
    obj.myFun()
}