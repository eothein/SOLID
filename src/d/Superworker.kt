package d

class Superworker(var name: String) : IWorker {

    override fun work() {
        println("$name is doing awesome superwork")
    }
}