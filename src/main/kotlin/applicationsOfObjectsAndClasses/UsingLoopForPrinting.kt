package applicationsOfObjectsAndClasses

fun main () {

    var res1 = Restaurants("LCD", 4.1, 200)
    var res2 = Restaurants("Fominoes", 3.9, 150)
    var res3 = Restaurants("SugarKing", 4.0, 250)
    var res4 = Restaurants("MacoBell", 4.3, 400)
    var res5 = Restaurants("Hubwary", 3.5, 200)


    /*
     --> if we print this it will give its own value
     --> this is cuz machine use its own reference name to call objects but we want the actual
        data. so for that we will add the word 'data' in front the class and then print it.
     --> but in real life there will be so many objects in that case we cannot print like this
     --> so instead of doing like this we can run a loop.
     println(res1)
    println(res2)
    println(res3)
    println(res4)
    println(res5)
      for(i in 1.. ) --> if we run loop then we don't know up to where the iterator will go
    */



    var restaurantList = mutableListOf(res1,res2,res3)
    //adding list
    restaurantList.add(res4)
    restaurantList.add(res5)

    println(restaurantList)    //it will print list in the same line

    println()

    //For printing in different line
    // --> Using for loop


    for (res in restaurantList) {
        println(res)
    }
}