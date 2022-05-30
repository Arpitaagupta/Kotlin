package classes_Objects

//PRIMARY AND SECONDARY CONSTRUCTORS

class Dog_PC (var breed : String, var color : String, var age : Int) {
    var name : String?= null

    constructor(breed : String, color : String, age : Int, name:String):
            this(breed,color,age)

    //--> tells the compiler that these variables has already  been initialized
    // in primary constructor and hence they do not need to add them to secondary constructor.

    {
        this.name=name
    }


}

fun main () {

}

//this --> this keyword assign values of constructor variables to member variables.