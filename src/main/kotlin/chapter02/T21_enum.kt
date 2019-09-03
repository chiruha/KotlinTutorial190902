package chapter02

enum class Direction(val no: Int, val str: String){
    NORTH(11, "north"),
    SOUTH(12, "south"),
    WEST(13, "west"),
    EAST( 14, "east")
}

enum class Direction2{
    NORTH{
        override val data1: Int = 10
        override fun myFun() {
            println("north myFun")
        }

    },
    SOUTH{
        override val data1: Int = 10
        override fun myFun() {
            println("south myFun")
        }
    },
    WEST{
        override val data1: Int = 10
        override fun myFun() {
            println("west myFun")
        }
    },
    EAST{
        override val data1: Int = 10
        override fun myFun() {
            println("east myFun")
        }
    };

    abstract val data1: Int
    abstract fun myFun()
}


fun main() {
    val dir: Direction = Direction.WEST
    println("${dir.name} ${dir.ordinal}")
    println(Direction.NORTH.no)

    var dir2: Direction2 = Direction2.EAST
    println("test ::: ${dir2.data1}, ${dir2.myFun()}, ${dir2.ordinal}")

}
