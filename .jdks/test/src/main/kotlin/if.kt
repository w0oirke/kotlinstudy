fun main() {
    if (20 > 10) {
        println("20이 더 크다")
    }
    val x = 20
    val y = 18
    if (x > y) {
        println("x가 y보다 크다")
    }

    val time = 20
    if (time < 18) {
        println("좋은 아침")
    } else {
        println("좋은 저녁")
    }

    val greeting = if (time < 18) {
        "좋은 아침"
    } else {
        "좋은 저녁"
    }
    println(greeting)
}