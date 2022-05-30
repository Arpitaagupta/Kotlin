package arrays

fun main()  {

    //Ques3 --> Get the index of the character ‘t’ in the string “Cristiano Ronaldo”.
    //Ques4 --> Define a variable as 600 and a string as “Cristiano Ronaldo” and
    // print the message “Cristiano Ronaldo has scored 600 league goals!!” using string template.


    val b = "Cristiano Ronaldo"
    val stringIndex = b.get(4)
    println(stringIndex)

    val score = 600
    println("${b} has scored ${score}")
}
