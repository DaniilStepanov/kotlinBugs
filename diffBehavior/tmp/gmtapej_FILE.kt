// Bug happens on JVM , JS -Xir-produce-js
// WITH_RUNTIME
// FILE: tmp0.kt


// DIFF_ONLY_IN_ADDRESSES
import kotlin.experimental.ExperimentalTypeInference
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*


class TypeDefinition<K : Any> {
    fun parse(parser: (uintProgression: String) -> K?): Unit {}
    fun serialize(parser: (l: Int) -> String): Unit {}
}

@OptIn(ExperimentalTypeInference::class)
fun <T : String> defineType(@BuilderInference box: TypeDefinition<T>.() -> Unit): Unit {}

fun test() {
    defineType {
        parse { fu4<String>().compareTo(Kla0().fu2().reduce({a: Char, b: Char -> '?'}).titlecase()).toString() + Int }
        serialize { it.toString().reduceRightOrNull({a: Char, b: Char -> '⍜'})?.titlecase()!! }
    }
}

fun box(): String {
    test()
    return "OK"
}

inline fun fu0(other: Int = 1, crossinline f: () -> String = { "FakeInt(42) == 1".dropWhile({a: Char -> false}).toUByte().toString() }) = { f() }()

class Kla0 {
    private fun fu1() = "Fail"

    private val prope0 = "OK"

    fun fu2(): String = fu0 { fu1().filterIndexed({a: Int, b: Char -> true}) + String }
override fun toString(): String{
var res = ""
res += prope0.toString()
return res
}}

fun box462(): String = Kla0().fu2()

fun <AsAny> fu4(): String {
    val prope1 = object {
        fun <Ty1> fu5() = "OK"
    }
    return prope1.fu5<Any>()
}

fun box313() = fu4<Int>()


