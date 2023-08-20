fun main() {
    val Num = 5 // int
    val doubleNum = 5.5 // double
    val floatNum = 5.5f // float
    val letter = 'c' // char
    val myBoolean = true // boolean
    val text = "Hello World!" // String

    // 이런식으로 변수 유형을 지정하고 값을 할당할 수 있다.
    val myNum1: Int = 5                // Int
    val myDoubleNum1: Double = 5.99    // Double
    val myLetter1: Char = 'D'          // Char
    val myBoolean1: Boolean = true     // Boolean
    val myText1: String = "Hello"      // String

    //byte
    val myByte: Byte = 100
    println(myByte)

    //short
    val myShort: Short = 5000
    println(myShort)

    //int
    val myInt: Int = 100000
    println(myInt)

    //long
    val myLong: Long = 15000000000L
    println(myLong)

    //float
    val myFloat: Float = 5.99f
    println(myFloat)

    //double
    val myDouble: Double = 19.99
    println(myDouble)

    //boolean
    val isJavaFun: Boolean = true
    val isFishTasty: Boolean = false
    println(isJavaFun)
    println(isFishTasty)

    //char
    val myGrade: Char = 'B'
    println(myGrade)

    //string
    val myName: String = "John"
    println(myName)

    // 유형 변환
    val x: Int = 5
    val y: Long = x.toLong()
    println(y) // 5
}