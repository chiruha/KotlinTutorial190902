package chapter02

fun main() {
    val obj = MyOuter.MyNested()
    //val obj2 = MyOuter.MyInner() // 생성불가
}

class MyOuter {
    var no: Int = 10
    inner class MyInner {
        val name = "hello"
        fun myFun() {
            println("inner $name $no")
        }
    }

    class MyNested { // 외부에 접근 불가
        val name = "world"
        fun myFun() {
            println("nested class $name")
        }
    }
}