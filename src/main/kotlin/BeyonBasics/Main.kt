package kotlin.BeyonBasics

fun main(args: Array<String>) {

    val book = Book("Don Quijote", "Miguel Cervantes", 1800,900)
    val bookTitleAuthor = book.getTitleAuthor()
    val bookTitleAuthorYear = book.getTitleAuthorYear()

    println("Here is your book ${bookTitleAuthor.first} by ${bookTitleAuthor.second}")

    var puppy = Puppy().playWithBook(kotlin.Clases.Book("DQ","Cervantes",1700,2500))





}