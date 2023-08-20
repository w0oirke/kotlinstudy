fun main() {

    // var 와 val 의 차이점은 변수를 선언할 때 var 는 변수를 선언할 때 사용하고 val 는 상수를 선언할 때 사용한다.
    // 지정된 변수 유형을 사용하지 않아도 된다.
    var name = "John Doe"
    val age = 20

    println(name)
    println(age)

    // 변수 유형을 지정할 수도 있다.
    var name2: String = "Jane Doe"
    val age2: Int = 20

    // 변수를 선언하고 바꿀수 있다. 단 유형을 지정하는 경우에만 가능하다.
    var name3: String
    name3 = "John Doe"
    println(name3)

    // 잘못된 예시 1
/*    var name
    name = "John"
    println(name)
    */

    // 잘못된 예시 2
    /*val name = "John"
    name = "Robert"
    println(name)*/

    val name4 = "John"
    println("hello " + name4)

    val firstName = "John "
    val lastName = "Doe"
    val fullName = firstName + lastName
    println(fullName)

    // 숫자 연산자로도 작동
    val x = 5
    val y = 6
    println(x + y)
}