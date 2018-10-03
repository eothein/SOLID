package i

class AndroidComponent : TouchComponent {

    override fun touch(event: String) {
        println("Touch Event Fired")

    }

    override fun swipe(event: String) {
        println("Swipe Event Fired")

    }

    override fun validate() {
        println("All UI i valid")

    }

}