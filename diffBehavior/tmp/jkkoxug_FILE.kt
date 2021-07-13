// Bug happens on JVM , JS 
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.experimental.ExperimentalTypeInference
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*


class TypeDefinition<K : Any> {
    fun parse(parser: (serializedValue: String) -> K?): Unit {}
    fun serialize(parser: (value: K) -> Any?): Unit {}
}

@OptIn(ExperimentalTypeInference::class)
fun <T : Any> defineType(@BuilderInference definition: TypeDefinition<T>.() -> Unit): Unit {}

fun test() {
    defineType {
        parse { it as Int }
        serialize { it.toString() }
    }
}

fun box(): String {
    test()
    return "OK"
}

inline fun fu0(other: Int = 1, crossinline f: () -> String = { "fail" }) = { f() }()

class Kla0 {
    private fun fu1() = "O"

    private val prope0 = "K"

    fun fu2(): String = fu0 { fu1() + prope0 }
override fun toString(): String{
var res = ""
res += prope0.toString()
return res
}}

fun box462(): String = Kla0().fu2()

interface Kla1 {
    fun fu3(a: String = "OK"): String
}

interface Kla2 : Kla1

interface Kla3 {
    fun fu3(a: String = "Fail"): String
}

class Kla4 : Kla2, Kla3 {
    override fun fu3(a: String) = a
}

fun box579(): String = Kla4().fu3()


