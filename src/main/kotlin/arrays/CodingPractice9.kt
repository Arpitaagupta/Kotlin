package arrays
import java.util.*

//Ques9
//Create two arrays, one with the first 5 even numbers
// and another with first 5 odd numbers and
// add each element of the first array with every corresponding element of the second array.

fun main () {
    val even = arrayOf(2,4,6,8,10)
    val odd = arrayOf(1,3,5,7,9)
    val result = arrayOf(even[0]+odd[0],even[1]+odd[1],even[2]+odd[2],even[3]+odd[3],even[4]+odd[4])
    println(Arrays.toString(result))



}
