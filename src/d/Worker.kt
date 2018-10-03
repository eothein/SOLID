package d

class Worker(var name: String) : IWorker {

    override fun work() {
        println("$name is working hard!")
    }
}