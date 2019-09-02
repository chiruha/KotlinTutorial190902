package chapter01

fun main() {
    val result = sum(10, 20)
    println(result)

    val result2 = sum2(100, 200)
    println(result2)
}

fun sum(a:Int, b:Int=1000):Int {
    var sum = 0
    fun calSum() {
        sum = a+b
    }
    calSum()
    return sum
}

fun sum2(a:Int, b:Int) = a + b