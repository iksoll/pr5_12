import kotlin.math.pow

fun main() {
    var one = readLine()!!.toDouble()
    var two = readLine()!!.toDouble()
    when{
        (one>two) -> println (one+1)
        (two>one)-> println (two+1)
        (one==two) -> println(one.pow(3))
    }



    var three = readLine()!!.toInt()
    when{
        (three == 0)->println("Ноль")
        (three == 1)->println("Один")
        (three == 2)->println("Два")
        (three == 3)->println("Три")
        (three == 4)->println("Четыре")
        (three == 5)->println("Пять")
        (three == 6)->println("Шесть")
        (three == 7)->println("Семь")
        (three == 8)->println("Восемь")
        (three == 9)->println("Девять")
    }
}