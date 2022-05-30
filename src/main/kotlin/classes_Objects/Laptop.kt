package classes_Objects

class Laptop {
                    //QUES1
    //Create a class ‘Laptop’ with properties as RAM, brand and hard disk size.
// Also, create a function ‘performComputations’ in it.


    //QUES2 --> For the class ‘Laptop’ created in the previous question,
    // create two different objects in the main function.

    var ram : Int = 4
    var brand : String = "Dell"
    var hdd : Int = 512


    fun performComputations () {
        println("I perform computations")
    }
}

fun main () {
    val laptop = Laptop()
    println(laptop.ram)
    println(laptop.brand)
    println(laptop.hdd)
    laptop.performComputations()

    val laptop1 = Laptop()
    laptop1.ram = 16
    laptop1.brand = "HP"
    laptop1.hdd = 512
    println(laptop1.ram)
    println(laptop1.brand)
    println(laptop1.hdd)
    laptop1.performComputations()


    val laptop2 = Laptop()
    laptop1.ram = 4
    laptop1.brand = "Dell"
    laptop1.hdd = 256
    println(laptop1.ram)
    println(laptop1.brand)
    println(laptop1.hdd)
    laptop1.performComputations()


    val laptop3 = Laptop()
    laptop1.ram = 16
    laptop1.brand = "Apple"
    laptop1.hdd = 512
    println(laptop1.ram)
    println(laptop1.brand)
    println(laptop1.hdd)
    laptop1.performComputations()




}