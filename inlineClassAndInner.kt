inline class Augmented(val x: Int) {
    fun ext(): String = TODO()
    inner class Inner {
        fun innerFun() {
            ext()
        }
    }
}
