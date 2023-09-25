fun main() {
    val i = 0
    val a:Int= readLine()!!.toInt()

    for (i in 1 .. a ){
        for (j in 1.. i){
            print("*")
        }
        println()
    }
}