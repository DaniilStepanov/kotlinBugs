// Bug happens on JVM 
// FILE: tmp0.kt

interface I<T> {
    val prop: Any
fun h(s: String = ""): Any
}
interface I2<foo> : I<Int>
open class A<T> {
inline fun h(x: String = 1.toChar().uppercase()) = x
}
class callLocal : A<Int>(), I2<Any> {
    override val prop
        get() = ""
}

