package conditionals_Loops_Lists

fun main () {
    val num = 11
    when(num) {
        in 1..10 -> println("Between 1 to 10")
        in 11..20 -> println("Between 11 to 20")

        else -> println("None")
    }

}