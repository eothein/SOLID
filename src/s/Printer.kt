package s

class Printer() {
    fun print(bookData: BookData):String {
        return "${bookData.title}, a book by ${bookData.author}.\n{$bookData.text}"
    }
}