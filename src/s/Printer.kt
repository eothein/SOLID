package s

class Printer : IPrinter {

    override fun print(printable: Printable) {
        println(printable.getContent())
    }
}