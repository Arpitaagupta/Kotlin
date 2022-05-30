package conditionals_Loops_Lists

fun main () {
    //QUES 4
// Check whether a variable num = 40, lies between 30 to 50 or not.

    val num = 40
    when(num) {
        in 30..50 -> println("Lies Between 30 to 50")


        else -> println("Does not Lies Between 30 to 50")
    }
}