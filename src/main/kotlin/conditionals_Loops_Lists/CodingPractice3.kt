package conditionals_Loops_Lists
fun main () {
    //QUES
// Create a function called ‘compareArrayLength’ which checks the length of two string
// arrays to be equal or not

    val a = arrayOf("Internshala", "Trainings")
    val b = arrayOf("Android", "App", "Developement")
    print(compareArrayLength(a, b))
}

fun compareArrayLength(a:Array<String>,b:Array<String>):Boolean {

    return a.size == b.size


}