package conditionals_Loops_Lists

fun main () {
    //QUES12
    //Create a program in Kotlin to calculate the factorial of number 10.

    var fact =1
    for(i in 10 downTo 1) {
        fact *= i
    }
    println(fact)
}