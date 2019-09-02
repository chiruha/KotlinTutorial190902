package chapter02

fun main() {
    val user = MyUser5()
    user.setData("hello@abc.com")
    println(user.email)
}

class MyUser5{
    lateinit var email: String  // 코틀린에서는 선언시 데이터가 있어야하므로 lateinit 사용
    val name: String by lazy {
        println("hello world")
        "hello"
    }

    fun setData(str: String) {
        email = str
    }
}