package conditionals_Loops_Lists

fun main () {

    val  a = arrayOf("P","E","A","N","U","T")
    for (element in a){
        print(element)
    }
    println()

    val b = arrayOf("B","U","T","T","E","R")
    for (i in 0 until b.size) {
        print(b[i])    //--> Until excludes the last entity
    }

    println()


    val c = arrayOf("H", "O", "N", "E", "Y")

    for (i in 0..c.size-1) {
        print("${c[i]}")
    }

}