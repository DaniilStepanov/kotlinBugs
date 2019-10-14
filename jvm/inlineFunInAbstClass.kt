interface I2<T> {
    val prop: T
    fun f(x: String = ""): String
}

abstract class A {
    inline fun f(x: String) = x
}

class B : A(), I2<String> {
    override val prop
        get() = ""
}

val b = B().f().plus(TODO())
