package chapter02

val obj1 = object {
    var no: Int = 10
    fun myFun() {
        println("hello world")
    }
}

open class SomeClass {
    fun SomeClassFun() {
        println("some class function")
    }
}

interface SomeInterface {
    fun someInterfaceFun()
}

val obj2: SomeClass = object : SomeClass(), SomeInterface {
    override fun someInterfaceFun() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

object obj3{
    fun myFun() {
        println("obj3 my Fun")
    }
}

class MyClass4 {
    companion object {
        fun myFun() {
            println("companion object myFun")
        }
    }
}

fun main() {
    // val a: obj3 = obj3() // object 는 생성과 동시에 객체가 생성되므로 이런식으로 사용 안함
    obj3.myFun()
    MyClass4.myFun()
}