package kotlin.BeyonBasics

open class Book(var title: String, var author: String, var year: Int,
           var pages: Int) {

    companion object {
        val BASE_URL = "https://blincoln.goalexandria.com/"
    }

    fun getTitleAuthor(): Pair<String, String> {
        return (title to author)
    }


    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(bookUsed: Int) : Boolean {
        return bookUsed < Constants.MAX_NUMBER_BOOKS
    }

    fun printUrl() {
        println(Constants.BASE_URL + title + " .html")
    }


}



