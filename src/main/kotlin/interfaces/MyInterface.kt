package interfaces

interface MyInterface {

    fun hello () //function without implementation

    fun greeting () = println("Hello There")   //function with default implementation
}

//When we talk about interfaces we don't call it inheritance, we call it --> implementation(to avoid confusion)