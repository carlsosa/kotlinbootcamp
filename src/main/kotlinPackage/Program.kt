import kotlinPackage.BeyondBasics.Book
import kotlinPackage.BeyondBasics.Puppy
import kotlinPackage.Functions.dayOfTheWeek


fun main(){
        dayOfTheWeek();

        val book = Book("Don Quijote", "Miguel Cervantes", 1800,900)
        val bookTitleAuthor = book.getTitleAuthor()
        val bookTitleAuthorYear = book.getTitleAuthorYear()

        println("Here is your book ${bookTitleAuthor.first} by ${bookTitleAuthor.second}")

        var puppy = Puppy().playWithBook(Book("DQ","Cervantes",1700,2500))



    }
