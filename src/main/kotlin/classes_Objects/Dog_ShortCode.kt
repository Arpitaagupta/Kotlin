package classes_Objects

class Dog_ShortCode (var breed : String,
                     var color : String,
                     var age : Int)
{
    fun eat() {
        println("${breed} = eat food")
    }

    fun bark() {
        println("${breed} = bark")
    }
}

fun main() {
    val dog1 = Dog_ShortCode("Labrador",  "Brown",  3 )
    dog1.eat()
    dog1.bark()

    val dog2 = Dog_ShortCode("German Shepherd", "Black", 2)
    dog2.eat()
    dog2.bark()

}