package s.optimized

class PrintableBook(private val bookData: BookData) : Printable {


    /**
     * Overriding the content values for a printable book.
     */
    override val content: String?
        get() = bookData.text
}