package chapter03

import kotlin.reflect.KClass

val myVal: KClass<*> = String::class

fun myFun(arg: KClass<*>) {
    println("class info")
    println("isAbstract: ${arg.isAbstract}")
    println("isOpen: ${arg.isOpen}")
    println("isFinal: ${arg.isFinal}")
}

open class MyClass

fun main() {
    myFun(MyClass::class)
}