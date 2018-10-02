package s.optimized

/**
 * A class which prints the contents of the books to the standard output.
 */
class BookPrinter : Printer {


    override fun print(printable: Printable) {
        println(printable.content)
    }
}