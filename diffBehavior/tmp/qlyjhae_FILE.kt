// Bug happens on JVM , JS -Xir-produce-js, JS -Xir-produce-js -Xir-dce, JS 
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*


fun box(): String {
    val intList = mutableListOf<Int>()
    for (i in 1..7 step 2) {
        intList += i
    }
    assertEquals(listOf(1, 3, 5, 7), intList)

    val longList = mutableListOf<Long>()
    for (i in 1L..7L step 2L) {
        longList += i
    }
    assertEquals(listOf(1L, 3L, 5L, 7L), longList)

    val charList = mutableListOf<Char>()
    for (i in 'a'..'g' step 2) {
        charList += i
    }
    assertEquals(listOf('a', 'c', 'e', 'g'), charList)

    return "OK"
}

inline fun fu0(x: (Int, Kla0) -> Unit) {
    x(1, Kla0(null, "", ((1..7).start.sign..2).start.sign))
}

data class Kla0(
        val id: String?,
        val name: String,
        val distance: Int){
override fun toString(): String{
var res = ""
res += id.toString()
res += name.toString()
res += distance.toString()
return res
}
}

fun box632(): String {
    fu0 { i, (Ty0, Ty1, Ty2) -> (1L..7L).step.sign }
    return "OK"
}

operator fun Long.component1() = this + 1

operator fun Long.component2() = this + ((1L..7L)).random().countOneBits()

fun fu1(prope1 : Array<Long>): String {
    var prope0 = ""
    for ((Ty3, Ty4) in prope1) {
      prope0 += {"$Ty3:$Ty4;"}()
    }
    return prope0
}

fun box351(): String {
  val prope1 = ('a'..'g').flatMapIndexed({a: Int, b: Char -> arrayOf<Boolean>(false).toBooleanArray().mapIndexed<Array<Long>>({a: Int, b: Boolean -> emptyArray<Long>()})}).getOrElse(51, {a: Int -> LongArray(35, {a: Int -> -12}).toTypedArray()})
  val prope0 = fu1(prope1)
  return if (prope0 == "1:2;2:3;3:4;") {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail: $prope0"
}
}


