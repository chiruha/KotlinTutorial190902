package chapter02

interface MyInterface{
    fun myFun1()
    var data1: String

}

interface MyInterface2 {
    fun myFun2()
}

class MyImplement: MyAbstract(), MyInterface, MyInterface2 { // 첫번째는 상속받는 클래스, 그 이후는 인터페이스
    override fun myFun2() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override val name: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun myFun1() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override var data1: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}

}