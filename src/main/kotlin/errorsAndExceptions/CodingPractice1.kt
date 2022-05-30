package errorsAndExceptions

fun main() {
                //QUES1
    //Print the value present at index 6 in the given array.
    //arr = [0, 100, 200, 300, 400, 500].
   // Use try-catch to catch the exception if any.

    val d = arrayOf(0,100,200,300,400,500)

    try {

        println(d[6])
    }

    catch (e:ArrayIndexOutOfBoundsException){
        println("I ran and caught the exception.")  //--> writing this message is optional

    }

    finally {
        println(d.contentToString())
    }




}