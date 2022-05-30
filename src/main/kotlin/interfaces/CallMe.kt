package interfaces

class CallMe : MyInterface,NewInterface {  // this is how interface gets invoked

    override  fun hello() {
        println("Function hello is called here")
    }

    override fun greeting() {
        println("New Greeting can be given here")
    }

    override fun newMethod(){
        println("Function of new Interface")
    }
}