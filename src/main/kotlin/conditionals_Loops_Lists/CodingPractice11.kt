package conditionals_Loops_Lists

fun main () {
    //QUES11
    //In the mutable version of the list in the previous question add the string: “Harry Kane”.
    // From the modified list remove the string: “Wayne Rooney”.
    // Now in this list add the string: “Neymar Jr.” at index 1. Now print the modified mutable list.

    val listOfStrings = mutableListOf("Lionel Messi", "Wayne Rooney", "Luka Modric", "Eden Hazard", "Sergio Aguero")


    println(listOfStrings)

    //adding the string: “Harry Kane”
    listOfStrings.add("Harry Kane")

    //removing element from string
    listOfStrings.removeAt(1)

    //adding list at particular index
    listOfStrings.add(1,"Neymar Jr")

    print("Modified String is : ")
    println(listOfStrings)
}
