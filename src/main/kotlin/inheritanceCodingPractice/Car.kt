package inheritanceCodingPractice


open class Car(var brandName:String,var colour:String) {
                        //QUES1
    // Create a parent class Car and functions speedUp() and applyBrake().
// Now create two different child classes inheriting class Car. Also, create
// objects for both of the child classes and use the functions that were
// created inside the parent class.

                        //QUES2
    //In the previous class Car give the properties as brandName and color.
    // Initialise the brandName as Hyundai and Honda for the respective classes.

                        //QUES3
    //In the previous example create an open function maxSpeed() in the parent class Car.
    // Now override this function in the child classes and print the message as “Maximum
    // speed of Hyundai is 120 kmph” and “Maximum speed of Honda is 150 kmph”.

    fun speedUp() {
        println("I speed up")
    }

    fun applyBrake() {
        println("I apply brake")
    }

    open fun Brand() {
        println("I am a brand")
    }

    open fun Colour() {
        println("the color is")
    }

    open fun maxSpeed() {

    }


}