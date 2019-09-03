package chapter03

import java.lang.Exception

fun main() {
    fun myFun(arg: String): Int{
        val result: Int = try{
            println("in try")
            arg.toInt()
        } catch (e: Exception) {
            println("${e.toString()}")
            0
        } finally {
            println("finally")
        }

        return result
    }

    val res = myFun("0")
    println(res)

    if(res < 1) {
        throw Exception("parameter must me greater than zero!!")
    }
}