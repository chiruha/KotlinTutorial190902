package chapter02

fun main() {
    val user = User4()
    user.name = "kotlin"
    println(user.name)

    val temp: Int
}

class User4{
    var name: String = "hello"
        get() = field.toUpperCase()
        set(value) {field = "this is $value"}

    var age: Int = 20 // val 은 set 불가
        set(value)  {
            if(value > 0) field = value else 0
        }
}