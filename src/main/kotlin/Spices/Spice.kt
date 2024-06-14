package kotlin.Spices

abstract class Spice (name: String, spicyLevel: String="mild")  :SpiceColor {

    var name = name;
    var spicyLevel = spicyLevel;
    val heat: Int
        get() {return 5 }

    abstract  fun prepareSpice()

}