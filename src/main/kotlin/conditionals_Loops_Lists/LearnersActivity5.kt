package conditionals_Loops_Lists

fun main(){
    var stringList = listOf<String>("Arpita","Roshni","Sunidhi","Herina","Priyal")
    var list = listOf<String>("Arpita","Roshni","Sunidhi")
    for(element in stringList){
        print(element+" ")
    }
    println()
    println(stringList.get(0))
    println(stringList.indexOf("Herina"))
    println(stringList.lastIndexOf("Herina"))
    println(stringList.size)
    println(stringList.contains("Arpita"))
    println(stringList.contains("Aanvi"))
    println(stringList.containsAll(list))
    println(stringList.subList(2,5))
    println(stringList.isEmpty())
    println(stringList.drop(1))
    println(stringList.dropLast(2))
}