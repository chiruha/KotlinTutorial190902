package chapter02

class Product(val name: String, val price: Int)

data class MyUser7(val name: String, val age: Int)

fun main() {
    val p1 = Product("p1", 100)
    val p2 = Product("p1", 100)
    println(p1.equals(p2))

    val u1 = MyUser7("kotlin", 11)
    val u2 = MyUser7("kotlin", 11)
    println(u1.equals(u2))
    println(u1.toString())
    println(u1.component1())

    val u3 = u2.copy()
    println(u3.toString())
}