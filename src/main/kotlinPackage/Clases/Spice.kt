package kotlinPackage.Clases


class Spice (name: String, spicyLevel: String="mild") {

    var name = name;
    var spicyLevel = spicyLevel;
    val heat: Int
        get() {return 5 }

    var spices : List<Spice> = listOf(Spice("Curry","mild"),Spice("Cayena","hot") )

    fun makeSalt(){
        spices.addLast(Spice("Salt","mil"))
    }
    fun size(): List<Spice> {
       return spices.filter { it.name.contains("curry") }.sortedBy { it.name.length }

    }

    fun endsWith(): List<Spice> {
       return spices.filter{it.name.startsWith('c')}.filter{it.name.endsWith('e')}
    }

    fun takeStartWith(): List<Spice> {
        return spices.take(3).filter{it.name.startsWith('c')}
    }


}