package chapter02

abstract class MyAbstract { // 초기화 오류 해결 방법 중 lateinit 이나 by lazy 외에 abstract 사용하는 방법도 있다
    fun myFun(){}
    abstract fun myFun2()

    abstract val name: String

}

class MyClass6: MyAbstract() {
    override fun myFun2() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override val name: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

}