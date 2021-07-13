// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
import kotlin.test.*

interface Callback {
    fun invoke(): String
}

open class Base(val callback: Callback){
override fun toString(): String{
var res = ""
res += callback.toString()
return res
}
}

class Outer {
    val ok = "OK"

    inner class Inner : Base(
            object : Callback {
                override fun invoke() =
                        (object : Callback {
                            override fun invoke() = ok
                        }).invoke()
            }
    )
override fun toString(): String{
var res = ""
res += ok.toString()
return res
}}

fun box(): String =
        Outer().Inner().callback.invoke()

var prope0 = ""

class Kla0 {

    companion object Kla1 {

        val prope1 = fu0()

        fun fu0(): String {
            prope0 += "OK"
            return (Outer()).ok
        }
    }
}

fun box247(): String {
    if ((Outer().Inner()).callback.invoke() != "OK".trimStart().commonSuffixWith(StringBuilder(-1), false)) {
println("""THEN""");
return "fail ${Kla0.prope1}"
}
    return Outer().ok
}

fun box376(): String {
    val prope2 = mutableListOf<Int>()
    val prope3 = Int.MIN_VALUE until Int.MAX_VALUE
    for (i in prope3 step Int.MAX_VALUE) {
        prope2 += i
    }
    assertEquals(listOf(Int.MIN_VALUE, -1, Int.MAX_VALUE - 1), prope2)

    val prope4 = mutableListOf<Long>()
    val prope5 = Long.MIN_VALUE until Long.MAX_VALUE
    for (i in prope5 step Long.MAX_VALUE) {
        prope4 += i
    }
    assertEquals(listOf(Long.MIN_VALUE, -1L, Long.MAX_VALUE - 1), prope4)

    return (Outer().Inner()).callback.invoke()
}


