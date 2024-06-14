package kotlinPackage.Basics

fun main(){

    // operator methods

    val fish_lefts  = 2.plus(71).plus(233).minus(13).div(30).plus(1)

    // variable quiz
    var rainbowColor : String = "red"
    rainbowColor = "blue"
    val blackColor = "black"
    println(rainbowColor)
    // blackColor = "white"

    //nullability
    var greenColor = null
    var blueColor: Int? = null

    //nullability list
    var list =listOf(null,null)

    // null check
    var nullTest :Int ? = null;
    println(nullTest?.inc() ?:0)

}

