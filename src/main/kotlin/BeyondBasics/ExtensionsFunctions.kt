package kotlin.BeyonBasics

fun kotlin.Clases.Book.weight() : Double { return (pages * 1.5) }
fun kotlin.Clases.Book.tornPages(torn: Int) = if (pages >= torn) pages -= torn else pages = 0;