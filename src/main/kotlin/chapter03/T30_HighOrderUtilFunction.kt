package chapter03

val result = run {
    println("function call")
    10+20
}

class MyUser{
    var name: String? = null
    var age: Int? = null
    fun sayHello() {
        println("I am $name, $age years old.")
    }
}

fun main() {
    val user = MyUser()
    user.name = "kotlin"
    user.age = 11
    user.sayHello()
    val result = user.run {
        name = "hello"
        age = 12
        sayHello()
    }

    println("result ${result}")

    val user2 = user.apply {
        name = "world"
        age = 13
        sayHello()
    }

    println("user2 ${user2}")

    user2.let {
        it.sayHello()
    }
    
    /*
    user2?.let { nullable 가능
        it.sayHello()
    }
    * */

    with(user2) {
        name = "android"
        age = 14
        sayHello()
    }

    MyUser().run {
        name = "test"
        age = 15
        sayHello()
    }
}