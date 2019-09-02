package chapter01

fun main() {
    val list1 = listOf<String>("hello", "world", "kotlin", "android")
    val iterator = list1.iterator()
    while(iterator.hasNext()) {// 처음 호출해야 그 다음을 가르킴
        println("값 : ${iterator.next()}")
    }

    val myMap = mapOf<String, String>(
        "one" to "hello", "two" to "world"
    )

    val iteratorMap = myMap.iterator()
    while(iteratorMap.hasNext()) {
        val res = iteratorMap.next()
        println("${res.key} :: ${res}")

    }
}