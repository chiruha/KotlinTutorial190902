package chapter03

// 익명함수
fun sum(a: Int, b:Int): Int {
    return a+b;
}

fun tempFun(): Int {
    return 10+20
}

val tempFunLambda = { 10+20 } // 파라미터 없을 경우 화살표 생략 가능 "-> 10+20"
val tempLambda2 = {a:Int, b:Int ->
    println("hello world $a - $b")
    a-b
}

// 코틀린에서는 변수에 함수 대입 가능
val temp = ::sum // 리플렉션

// 람다식
val sum1 = {a:Int, b:Int -> a+b}

fun main() {
    val res = sum(10, 20)
    println("res :: ${res}")
    println("sum2 :: ${sum(11, 13)}")
    println("temp :: ${temp(11, 15)}")
    println("tempFunLambda :: ${tempFunLambda()}")
    println("funLambda :: ${tempLambda2(20, 9)}")}