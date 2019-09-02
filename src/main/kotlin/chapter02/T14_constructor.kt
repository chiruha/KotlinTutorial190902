package chapter02

fun main() {
    val user = MyUser3("hello", 11)
}

class MyUser3 (name: String) {
    init {
        println("init block $name")
    }
    
    constructor(name: String, age: Int) : this(name) { // 보조, 주 생성자 섞어쓸시 보조생성자에 this 필요
        println("secondary constructor $name $age")
    }
}