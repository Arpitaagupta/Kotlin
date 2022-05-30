package conditionals_Loops_Lists


fun main() {

    //Immutable List
    val listOfStrings = listOf("Box", "table", "chair")
    /*listOfStrings[1] = "Bed"
    print(listOfStrings)

    ERROR --> Unresolved Reference
     */

    //Mutable Lists
    val listOfStrings2 = mutableListOf("Peanut", "Dhruv", "Honey")
    listOfStrings2[1] = "Butter"
    println(listOfStrings2)



}