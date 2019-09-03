package chapter03

annotation class TestAnnotation(val count: Int)

@TestAnnotation(3)
class MyTestClass {
    @TestAnnotation(count =1)
    fun myFun() {

    }

    @TestAnnotation(5)
    val myVal: String = "hello world"

}

fun main() {
    val methods = MyTestClass::class.java.methods
    for(method in methods) {
        if(method.isAnnotationPresent((TestAnnotation::class.java))) {
            println("${method.name} has annotation")
            val annotation = method.getAnnotation(TestAnnotation::class.java)
            println(annotation.count)
        }
    }

}

