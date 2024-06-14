package kotlin.Clases

class SimpleSpice(){
    val name = "curry"
    val spiciness = "mild"
    val heat: Int
        get() {return 5 }

    fun message(){
        println("${name} ${heat}")
    }
}