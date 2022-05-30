package conditionals_Loops_Lists

fun main () {
    val a =10
    val b =10
  val max = if (a>b) a else b

    when (max) {
        in 1..10 -> println("x is in range")
        in 10..20 -> println("x is outside the range")
        else -> ("none of the above")
    }
}