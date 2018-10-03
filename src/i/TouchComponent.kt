package i

interface TouchComponent :Component{
    /**
     * Addressing a touch event
     */
    fun touch(event: String)

    /**
     * Adressing a swipe event
     */
    fun swipe(event: String)
}