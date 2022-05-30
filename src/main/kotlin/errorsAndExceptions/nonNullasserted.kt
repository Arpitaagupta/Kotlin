package errorsAndExceptions

fun main() {
    var nullValue : String? = null
    println(nullValue!!.length)
}

//Non-null assertion operator forces compiler to get output regardless of the fact that
//it can give null pointer exception and the program can crash.
//hence it is better to use safe calls instead of non-null asserted calls.