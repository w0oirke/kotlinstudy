fun main() {
    var greeting = "Hello"
    var greeting2: String = "Hello"

    println(greeting[0])
    println(greeting[1])

    var txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("txt 길이: " + txt.length)

    // 문자열 함수
    var txt2 = "Hello World"
    println(txt2.toUpperCase())   // Outputs "HELLO WORLD"
    println(txt2.toLowerCase())   // Outputs "hello world"

    var txt3 = "Hello World"
    var txt4 = "Hello World"
    println(txt3.compareTo(txt4))  // Outputs 0 (they are equal)

    var txt5 = "Please locate where 'locate' occurs!"
    println(txt5.indexOf("locate"))  // Outputs 7

    var firstName = "John"
    var lastName = "Doe"
    println(firstName + " " + lastName)
    println(firstName.plus(lastName))
    println("내 이름은 $firstName $lastName")

}