package chapter03

fun main() {
    val res1 = listOf(1,2,3).map{ it * 10}
    println("res1 :: ${res1}")

    val res = listOf(5,2,3).reduce { acc, i -> acc+i }
    println("res :: ${res}")

    listOf(12,11,13).sorted().forEach{
        print("${it} ")
    }

    println("")

    listOf(31,36,23).sortedBy{ it % 3 }.forEach{
        print("${it}")
        print("(${it % 3}) ")
    }
}