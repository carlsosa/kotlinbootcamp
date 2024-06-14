package kotlin.BeyonBasics

import java.util.*
import kotlin.Clases.Book


class Puppy() {
    fun playWithBook(book: Book) {
        book.tornPages(Random().nextInt(20))
    }
}