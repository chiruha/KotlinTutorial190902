package chapter02

fun main() {
    val obj = MyClass() // new operator 없이 생성가능
    obj.myFun()
}

class MyClass {
    // java는 파일명과 클래스이름이 동일해야하나 코틀린은 상관없다
    val myVariabl = 10
    fun myFun() {
        println("hello class")
    }
}

