package arrays

import java.util.*

fun main () {
    //Ques12 -->

    //Create a function in Kotlin which has a string and an array which contains
// the index of all the vowels present in that string.
// Print the array, and then calculate the sum of all the values of the array.
// Use the string: “I am a Kotlin programmer now”.


    val str = "I am a Kotlin programmer now"

    val arr = arrayOf(0,2,5,8,11,16,19,22,26)

    println(Arrays.toString(arr))
    println(arr.size)

    val sum = (arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5]+arr[6]+arr[7]+arr[8])
    println(sum)


}