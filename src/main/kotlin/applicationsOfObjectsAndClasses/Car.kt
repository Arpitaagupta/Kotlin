package applicationsOfObjectsAndClasses

class Car (val brandName: String, val color: String, val engineNumber: Int) {
    //QUES3
    //Create a class Car with brandName, color, and engineNumber as properties
    // along with accelerate() and applyBrakes() as functions.
    // In the main function create multiple objects of this class Car.


    fun accelerate() = println("Car is speeding up. Zoom!")

    fun applyBrakes() = println("Brakes applied!!! Screetch!")


}

fun main() {

    val myI20 = Car("Hyundai", "Black", 2342)
    myI20.accelerate()
    myI20.applyBrakes()


    val myAmaze = Car("Innova", "White", 1571)
    myAmaze.accelerate()
    myAmaze.applyBrakes()

}
