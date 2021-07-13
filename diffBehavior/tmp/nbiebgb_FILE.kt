// Bug happens on JVM , JS 
// FILE: tmp0.kt

import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
import kotlin.collections.*



inline fun <T, R> T.let2(block: (T) -> R): R {
    return block(this)
}

fun box(): String {
    val result = true.let2(Boolean::not)
    return if (!result) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail"
}
}

fun box950() = (33.toUInt().let2<UInt, Short>({a: UInt -> 75})).toString()

open class Kla0 {
    protected companion object Kla2 {
        fun fu1() = (33.toUInt().let2<UInt, Short>({a: UInt -> (33.toUInt().let2<UInt, Short>({a: UInt -> 75}))})).toChar().lowercase()
    }
}

class Kla1 : Kla0() {
    fun fu0() = { (33.toUInt().let2<UInt, Short>({a: UInt -> (33.toUInt().let2<UInt, Short>({a: UInt -> 75}))})).toString() + fu2() }

    private companion object {
        fun fu2() = "K"
    }
}

class Kla4<Ty0>(val prope0: Ty0){
override fun toString(): String{
var res = ""
res += prope0.toString()
return res
}
}

inline fun <Ty1, Ty2> MutableMap<Ty1, Kla4<Ty2>>.fu4(key: Ty1, defaultValue: ()->Ty2): Ty2 {
    val prope0 = get(key)?.prope0
    return if (prope0 == null){
println("""THEN""");

        val prope3 = defaultValue()
        put(key, Kla4(prope3))
        prope3
} else{
println("""ELSE""");

        prope0
}
}

class Kla5 {

    fun fu5(): String {
        return "hello".prope2
    }

    private val prope1 = hashMapOf<String?, Kla4<String>>()

    private val String?.prope2: String
        get(): String = prope1.fu4(this) { (Kla1().let2<Kla1, Kla1>({a: Kla1 -> Kla1()})).fu0().invoke() }
override fun toString(): String{
var res = ""
res += prope1.toString()
return res
}}

fun box707(): String {
    return Kla5().fu5()
}

tailrec fun fu6(x : Int = 0, e : Any = "a") {
    if (!e.equals("a")){
println("""THEN""");

        throw IllegalArgumentException()
}
    if (x > 0){
println("""THEN""");

        fu6(x - 1)
}
}

fun box253() : String {
    fu6(100000)
    return "OK"
}


