package chapter02

class MyClass1{} // () 축약됨
class MyClass2(){} // "constructor" 글자 축약됨
class MyClass3 constructor(){}

// java 의 경우
/*
class MyUser1Java{
    MyUser1Java(String name, int age) {
        
    }
    
    public void sayHello(){
        println("hello"+name)
    }
}
*/
//////////////////

class MyUser1 constructor(name: String, age: Int=0) { // 파라미터에 default 값 입력 가능
    val myName: String = name
    init{
        println(name)
    }

    fun sayHello() {
        println("hello $myName") // name은 사용 불가
    }
}