package chapter03

class MyAddress {
    val city: String? = "seoul"
}

class MyUser8 {
    val address: MyAddress? = MyAddress()
}


fun main() {
    val user = MyUser8()
    val city1 = if(user != null) {
        if(user.address != null) {
            if(user.address.city != null) {
                user.address.city
            } else {
                null
            }
        } else {
            null
        }
    } else {
        null
    }

    val city2 = user.address?.city // 위의 if 문을 null 확인 operator 로 간단하게 사용가능



    var str: String? = "kotlin"
    val length = if(str != null) str.length else 0


    if (str != null) {
        str.length // 스마트 캐스팅
    }

    str?.length
       
    str!!.length
    
    val res1: Int? = if(str != null) {str.length} else {null}
    val res2: Int? = str?.length
    val res3: Int? = str!!.length // null 이 확실히 아닐 때만 사용


    val temp: Int? = 13
    val temp2: Int = temp ?: 0 // null 일때 실행
    println("temp : $temp")
    println("temp2 : $temp2")

    val myInt = str as? Int
    println(myInt)

    val myLong: Long = 1000L
    val myInt2 = myLong as? Int
    println(myInt2)
}