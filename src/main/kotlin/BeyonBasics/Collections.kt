package kotlin.BeyonBasics

val allBooks = setOf("Cervantes", "Gatsby", "Handsome Siblings", "Cuentos Dominicanos")
val library = mapOf("Gatsby" to allBooks)

fun contains(){
    println(library.any { it.value.contains("Hamlet") })
}

val moreBooks = mutableMapOf<String, String>("Gatsby" to "La Odisea")

fun moreBooksList(){
    moreBooks.getOrPut("Tarzan") { "Unknown" }
    moreBooks.getOrPut("Don Quijote") { "Cervantes" }
    println(moreBooks)
}
