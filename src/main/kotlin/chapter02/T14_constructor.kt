package chapter02

fun main() {
    val user = MyUser3("hello", 11)
    val user2 = MyUser3("홍길동", 13, "abc@abcdef.com")
}

class MyUser3 (name: String) {
    init {
        println("init block $name")
    }
    
    constructor(name1: String, age: Int) : this(name1) { // 보조, 주 생성자 섞어쓸시 보조생성자에 this 필요
        println("secondary constructor $name1 $age")
    }

    constructor(name: String, age: Int, email: String) : this(name, age) {
        println("secondary constructor $name $age $email")
    }
}