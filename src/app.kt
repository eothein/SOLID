import o.AreaCalculator
import o.Rectangle
import s.book
import s.optimized.BookData
import s.optimized.BookPrinter
import s.optimized.PrintableBook


/**
 * The main routine, which is the entry point to a Kotlin application.
 * You need to provide the correct letter to execute the code.
 */
fun main(args: Array<String>){

    val SOLID = args[0]
    when(SOLID){
        "S" -> {
            val jBook = book("Jens Buysse", "Inhoud van het boek", "Titel van het boek")
            val hBook = book("Harm De Weird")
        }
        "SO" -> {
            val bookData = BookData(author = "Jens", text = "Lalalala", name = "Beautiful name")
            val printableBook = PrintableBook(bookData)
            val printer = BookPrinter()
            printer.print(printableBook)
        }
        "O" -> {
            val rec1 = Rectangle(5,10)
            val rec2 = Rectangle(3,4)
            val list : MutableList<Rectangle> = mutableListOf(rec1,rec2)
            val areaCalc = AreaCalculator()
            areaCalc.calculateArea(list)
        }

    }


}

