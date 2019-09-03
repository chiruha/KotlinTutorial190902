package chapter02

fun main() {
    val rect = MyRect()
    val shape = rect as MyShape

}

open class MyShape { // 코틀린은 기본적으로 final(상속금지) 이므로 상속시 open 붙여주기
    var x: Int = 0
    open var y: Int = 0
        set(value) { field = if(value < 0) 0 else value }
    open fun myPaint()  {
        println("location $x $y")
    }
            
}

class MyRect: MyShape(){
    override var y: Int = 100
    override fun myPaint() {

    }
}