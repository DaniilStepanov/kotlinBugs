interface Z {

    fun testFun(): String {
        return { privateFun() } ()
    }

    fun testProperty(): String {
        return { privateProp } ()
    }

    private fun privateFun(): String {
        return "O"
    }

    private val privateProp: String
        get() = "K"
}

object Z2 : Z {

}

fun box(): String {
    return Z2.testFun() + Z2.testProperty()
}


fun main() {
    repeat(100000000) {
        box()
    }
}