package errorsAndExceptions

fun main () {
    val nullList = listOf(1,2,3,null,4,5,null,6)


    val nullArrayList = arrayListOf("This", null, "is", "a", null,"statement")

    println("The list without null value is ${nullList.filterNotNull()}") //--> this will remove null


    println("The array list without null value is ${nullArrayList.filterNotNull()}")
}