package chapter01

fun main() {
    val a = 1
    when(a) {
        2 -> { println("value is 2")}
        1 -> { println("hello")}
        else -> { // 값을 리턴하는 경우는 반드시 else(default) 필요
            println("value is not 1 or 2")
        }
    }

    val b = "hello"
    when(b) {
        "hello" -> {println("hello 출력")}
        "hello" -> {println("world 출력")}
    }

    val c = 30
    when(c) {
        10,20 -> {println("TEST1")}
        30,40 -> {println("test2")}
        in 100..200 -> {}  // 100에서 200 사이
    }
    
    // switch 보다 복잡합 내용 사용 가능
    
}