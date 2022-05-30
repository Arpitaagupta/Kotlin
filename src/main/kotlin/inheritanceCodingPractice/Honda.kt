package inheritanceCodingPractice

class Honda(brandName:String,color:String): Car(brandName, color) {


//    override fun Brand() {
//
//        println("I am Honda")
//    }

    override fun Brand() {
        println("The brand of the car is $brandName")
    }

    override fun Colour() {
        println("The color of the car is $colour")
    }

    override fun maxSpeed() {
        println("Maximum speed of Honda is 150 kmph")
    }
}