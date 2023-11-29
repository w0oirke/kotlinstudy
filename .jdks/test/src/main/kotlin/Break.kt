fun main() {
    /*var i = 0
    while (i < 10) {
        println(i)
        i++
        if (i == 4) {
            break
        }
    }*/
    var i = 0
    while (i < 10) {
        if (i == 4) {
            i++
            continue
        }
        println(i)
        i++
    }
}