package chapter01

fun main() {
    val a = 5
    val b = if(a>10) {
        "hello"
    } else {
        println("if expression")
        "world" // return 을 표시하지 않아도 맨 마지막 줄 리턴함
    }
    
    println(b)
}