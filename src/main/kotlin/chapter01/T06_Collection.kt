package chapter01

fun main() {
    var array = arrayOf(1,2,3,"hello") // 타입추록
    var array2 = arrayOf<Int>(1,2,3)

    var array3: Array<Int> = arrayOf(1,2,3)

    array.size
    println("test : ${array[2]}")
    println(array.get(2))

    // List
    val myList: List<String> = listOf("hello", "world") // 변경불가 immutable
    val myList2: MutableList<String> = mutableListOf("hello1", "world1")

    myList2.add("kotlin") // val 이 가리키는 대상 MutableList<String> 이 변경되는 거싱 아니므로
    // val 이여도 add 등의 변경은 가능하다

    println("myList $myList")
    println("myList2 $myList2")

    // Set
    val mySet = mutableSetOf<String>()
    mySet.add("hello")
    println("mySet ${mySet.elementAt(0)}")

    // Map
    val myMap = mutableMapOf<String, String>()
    myMap.put("one", "helloMap")
    println(myMap.get("one"))
    println(myMap["one"])

}