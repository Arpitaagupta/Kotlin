package inheritanceAndInterface

fun main () {

    val c = sum(10,20)

    // val d = difference(30,16)
    //--> It will throw Error
    //Because private functions are  available only on file where they are created
    //Since we are using this function in different file --> its throwing an error.

    val e = division(20,2)

    /*
    val pro = product()
    pro.product(10,13)
     */

    class Product {
        protected fun protected (a:Int, b:Int) = a*b
    }
}