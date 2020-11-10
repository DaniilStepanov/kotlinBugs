inline class R(private val r: Int) {
    fun test():String = TODO()
}

fun box():String = TODO()

internal open class A<S: R> {
    fun box(): S =TODO()
}

