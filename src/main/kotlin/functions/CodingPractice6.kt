package arrays

fun main () {

    //Ques 6 --> Write different functions for calculating sum, difference, product, and division of two numbers and return each of them.


    println(addition(11, 8))
    println(multiply(5,3))
    println(subtraction(47, 36))
    println(division(89.0, 11.0))


}

//Block Body Code
fun addition(x: Int, y : Int): Int {
    val output = x + y
    return output
}

fun multiply(x: Int, y : Int): Int {
    val output = x * y
    return output
}


//Expression Body Code
fun subtraction(a: Int, b : Int) = a - b

fun division(a : Double, b : Double) = a / b
