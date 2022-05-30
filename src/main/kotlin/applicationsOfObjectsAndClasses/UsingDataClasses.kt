package applicationsOfObjectsAndClasses

fun main () {

    var res1 = Restaurants("LCD", 4.1, 200)
    var res2 = Restaurants("Fominoes", 3.9, 150)
    var res3 = Restaurants("SugarKing", 4.0, 250)
    var res4 = Restaurants("MacoBell", 4.3, 400)
    var res5 = Restaurants("Hubwary", 3.5, 200)
    var res6 = Restaurants("MacoBell", 4.3, 400)

    if (res4 == res6) {
        println("Same")
    }

    else {
        println("Different")
    }

    /*
    If we remove the keyword data from data class and run as normal class,
        the output would be --> Different

    -->Because we know that for normal classes the compiler performs operation on objects rather than data
            stored in objects.
     */

}