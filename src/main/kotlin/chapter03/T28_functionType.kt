package chapter03

// 함수타입

fun myFun(a: Int, b: Int): Boolean {
    return a>b
}

// 위의 함수를 람다로 만들면
val lambdaFun: (Int, Int) -> Boolean = {a: Int, b: Int -> a>b}

val lambdaFun2: (Int) -> Int = { x -> x*10}
val lambdaFun3: (Int) -> Int = {
    it*10
}