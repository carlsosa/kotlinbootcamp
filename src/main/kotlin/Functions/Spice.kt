package kotlin.Functions

class Spice (name: String, spicyLevel: String) {

    var name = name;
    var spicyLevel = spicyLevel;
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    fun size(): List<String> {
       return spices.filter { it.contains("curry") }.sortedBy { it.length }

    }

    fun endsWith(): List<String> {
       return spices.filter{it.startsWith('c')}.filter{it.endsWith('e')}
    }

    fun takeStartWith(): List<String> {
        return spices.take(3).filter{it.startsWith('c')}
    }


}