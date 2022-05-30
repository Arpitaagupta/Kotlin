package errorsAndExceptions

fun main() {

    val d = arrayOf(3,4,5,6)

    try {
        d[4] = 7
        println("I ran and changed the value.")
    }

    catch (e:ArrayIndexOutOfBoundsException){
        println("I ran and caught the exception.")

    }

    finally {
        println(d[2])
    //finally { // this finally is optional so we can also write it as
        //println(d.contentToString())
    }

}

//EXPLANATION
//Print statement in the try body does not get executed.
//Since there was an exception while the catch body executed and hence prints the statement.
//Try catch block prevents the exception from stopping the execution of program.