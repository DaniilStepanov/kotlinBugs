// Bug happens on JVM , JS -Xir-produce-js
// !LANGUAGE: +NewInference
// WITH_RUNTIME
// FILE: tmp0.kt


// DIFF_ONLY_IN_ADDRESSES
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
import kotlin.coroutines.*

interface A {
    val s: String
}
fun test(list: List<A>) {
    sequence {
        yieldAll(list.map { it.s })
    }
}

fun box(): String = "OK"

private fun fu0() {}

private suspend fun fu1() = suspendCoroutine<Unit> {
    fu0()
}

interface Kla0 {
    private inline fun <reified Ty0> fu2(b: () -> String): String {
        "String" is Ty0
        return b()
    }

    fun fu3() = fu2<Int> { "OK" }
}

class Kla1 : Kla0

fun box514(): String {
    return Kla1().toString()
}

class Kla2 {
    private companion object Kla3 {
        override fun toString(): String = (Kla1()).fu3().trimEnd({task: Char -> false})
    }

    inline class IT(val x: Int){
override fun toString(): String{
var res = ""
res += x.toString()
return res
}
}

    fun fu4() = (Kla1()).fu3().replaceIndentByMargin("uijqi", "gtvfy")
}

fun box859() = (Kla1()).fu3().plus("nksfo")


