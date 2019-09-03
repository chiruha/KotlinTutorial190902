package chapter03

// 고차함수 : 매개변수로 함수를 전달받거나 함수를 반환하는 함수

fun normalFun(a: Int, b: Int): Int {
    return a+b
}

fun hoFun(a: Int, b:(Int) -> Int) {
    val res = b(10)
    println("a: $a, b: $res")
}

fun hoFun2(b:(Int)->Int) {
    val res = b(10)
    println("res : $res")
}

// 함수를 리턴하는 함수
fun hoFun3(str: String): (Int, Int) -> Int {
    when(str) {
        "-" -> return {a,b -> a-b}
        "+" -> return {a,b -> a+b}
        "*" -> return {a,b -> a*b}
        else -> return {a,b -> a/b}
    }
}


fun main() {
    hoFun(10) { x -> x * 10 } // hoFun(10, {x->x*10})에서 마지막 인수가 함수 타입인 경우 괄호 생략가능
    hoFun2 { x -> x * 15 }

    val result = hoFun3("+")
    val value = result(10, 2)
    println("value :: ${value}")

}