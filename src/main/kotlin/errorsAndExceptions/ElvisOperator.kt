package errorsAndExceptions

fun main() {
    var nullValue: String? = null
    println(nullValue?.length ?: "This is Null")

                    //Elvis Operator --> ?:
    //Elvis Operator allows us to set a default value when a output of safe call is null.
}