package classes_Objects

class Dog_BoilerPlateCode (breed : String, color : String, age : Int){
    var breed : String
    var color : String
    var age : Int

    init {
        this.breed=breed
        this.color=color
        this.age=age
    }

    fun eat() {
        println("${breed} = eat food")
    }

    fun bark() {
        println("${breed} = bark")
    }
}

fun main (){

}