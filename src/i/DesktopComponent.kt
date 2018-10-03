package i

class DesktopComponent : MouseUIComponent {

    override fun mouseover(event: String) {
        println("Mouse click Event Fired")

    }

    override fun validate() {
        println("All UI i valid")

    }

}