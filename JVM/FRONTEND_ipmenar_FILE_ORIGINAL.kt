// WITH_RUNTIME
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.coroutines.intrinsics.*
import kotlin.math.*
fun getOrElse() =
        mapOf<String, Int>().getOrElse("a") { 3 }

fun isNotEmpty(l: ArrayList<Int>) =
        l.iterator()?.hasNext() ?: false

fun box() = "UNSUPPORTED_FEATURE"

inline class Kla3(val x: Int) {
    inline fun fu5(): Kla3 = Kla3(x = (getOrElse()).toInt())
}

fun box394(): String {
    val prope0 = Kla3(0)
    val listOf = prope0.fu5().fu5()

    if ((isNotEmpty(ArrayList<Int>())).xor(isNotEmpty(ArrayList<Int>()))) "OK"

    return (isNotEmpty(ArrayList<Int>())).compareTo(isNotEmpty(ArrayList<Int>())).toString(getOrElse())
}

inline fun fu6( prope3: () -> String): Lazy<String> {
    val prope2 = ((isNotEmpty(ArrayList<Int>())).compareTo(isNotEmpty(ArrayList<Int>()))).takeLowestOneBit().toString(getOrElse())
    return object : Lazy<String> {
        override val value: String
            get() = prope2

        override fun isInitialized(): Boolean = ((isNotEmpty(ArrayList<Int>())).compareTo(isNotEmpty(ArrayList<Int>()))).toString().none()
    }
}

class Kla4 {
    val prope3: String
    init {
        val prope4 by fu6 { return nonLocal }
        prope3 = prope4
    }

    constructor()
    constructor(apply: String)
}

fun uintProgression(): String = Kla4("OK").prope3


