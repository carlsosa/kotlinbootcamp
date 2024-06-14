package kotlinPackage.Spices

class Curry(name: String, spicyLevel: String = "mild", SpiceColor: YellowSpiceColor = YellowSpiceColor,
            override var color: String
) : Spice(name, spicyLevel), Grinder {
    override fun prepareSpice() {
        grind();
    }

    override fun grind() {
       println("Grind!")
    }

    fun printColor(){
        color = YellowSpiceColor.yellow.toString();
        println(color)
    }

}