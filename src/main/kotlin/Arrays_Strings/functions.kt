fun main (){
    iAmANewFunction()
    println(timesTwo(11))
    println(timesThree(12))
    println(timesFour(8))
}

fun iAmANewFunction() {
    println(message = "Have a nice day!")
}

fun timesTwo(x: Int): Int {
    val output = x * 2
    return output
}



fun timesThree(a: Int) = a*3

fun timesFour(b : Int) = b*4
