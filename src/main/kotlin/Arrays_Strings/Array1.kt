import java.util.*

fun main () {

    var oldArray = arrayOf('a', 'b', 'h', 'i', 'i', 'i', 'i')

    val charArray = arrayOf('p', 'e', 'a', 'n', 'u', 't')

    val otherArray = arrayOf('h', 'o', 'n', 'e', 'y', 'y')

    val newArr = arrayOf("Hello", 11, 0.8, true, 'A')

    oldArray = otherArray

    println(Arrays.toString(oldArray))

}