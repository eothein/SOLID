package s

/**
 * This class defines a s.book.
 *
 *
 * A class in Kotlin can have a primary constructor which is part of the class header.
 */

class Book(private val bookData: BookData) {


    /**
     * Initialization code can be placed in initializer blocks, which are prefixed with the init keyword.
     * During an instance initialization, the initializer blocks are executed in the same order as they
     * appear in the class body, interleaved with the property initializers:
     */
    init {
        println("Create a book from : $bookData.author")
    }
}