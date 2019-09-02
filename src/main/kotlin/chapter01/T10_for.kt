package chapter01

fun main() {
    for (i in 1..10 step 2) {
        println(i)
    }

    for(i in 1 until 10) { // until은 마지막 숫자 제외
        println("until ${i}")
    }

    for(i in 10 downTo 1) {
        println("downTo ${i}")
    }

    val list = listOf("Hello", "world", "kotlin")
    for(str in list) {
        println(str)
    }

}