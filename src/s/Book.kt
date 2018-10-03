package s

/**
 * This class defines a book.
 */

class Book(private val bookData: BookData) : Printable {

    override fun getContent(): String {
        return bookData.text
    }


    /**
     * Initialization code can be placed in initializer blocks, which are prefixed with the init keyword.
     * During an instance initialization, the initializer blocks are executed in the same order as they
     * appear in the class body, interleaved with the property initializers:
     */
    init {
        println("Create a book from : $bookData.author")
    }
}