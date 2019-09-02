fun main() {
    val str1: Char = 'c'
    val str2: String = "C"

    val str3 = "Hello\nWorld "
    val str4 = """ Hello 
        World """
    println(str3)
    println(str3)

    // 문자열 템플릿(string template)
    val myVal = 10
    println("hello $myVal")
    println("hi ${myVal+20}") // 중괄호가 먼저 실행됨
    println("hello ${sum(10,11)}")
}