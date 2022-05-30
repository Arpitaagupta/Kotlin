package classes_Objects

class Dog {

    var breed : String = "Labrador"
    var color : String = "Brown"
    var age : Int = 3

    fun eat() {
        println("${breed} = eat food")
    }

    fun bark() {
        println("${breed} = bark")
    }
}

fun main (){
    val dog1 = Dog()
    dog1.breed="German Shepherd"
    dog1.color="Black"
    dog1.age=1

    println("The breed of dog is ${dog1.breed}, whose color is ${dog1.color} and is ${dog1.age} years old.")

    dog1.eat()
    dog1.bark()
}