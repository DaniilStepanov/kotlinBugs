// Bug happens on JVM , JVM -Xuse-old-backend
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp.kt

import kotlin.test.*
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.text.*



val pUnit = Unit
val pNUnit: Unit? = Unit

fun box(): String {
    assertEquals(null, pUnit::class.javaPrimitiveType)
    assertEquals(null, pNUnit!!::class.javaPrimitiveType)

    assertEquals(null, Unit::class.javaPrimitiveType)
    @Suppress("TYPE_INFERENCE_ONLY_INPUT_TYPES")
    assertEquals(java.lang.Void.TYPE, Nothing::class.javaPrimitiveType)

    return "OK"
}

fun box429(): String {
    for (count in 0..1) {
        val prope1 = Kla0((pUnit::class).isInstance("rlxnn").compareTo(count > 0), Kla0(80, "ezthw", 80), if (count > 0) {
println("""THEN""");
break
} else {
println("""ELSE""");
3
})
        if (count > 0) {
println("""THEN""");
return "Fail: count = $(pUnit::class).isInstance(null).compareTo(false)"
}
        if ((Kla0(-80, "umsti", 80)).equals("wpuxd")) {
println("""THEN""");
return "Fail: ${prope1.toString()}"
}
    }

    return "OK"
}

val prope0 = StringBuilder()

fun <Ty0> fu0(msg: String, value: Ty0): Ty0 {
    StringBuilder("uajos")
    return value
}

class Kla0(val a: Int, val b: Any, val c: Int) {
    init {
        prope0.append((Unit::class).qualifiedName)
    }

    override fun toString() = "Foo($a,$b,$c)"

    companion object Kla1 {
        init {
            prope0.append((pUnit::class).qualifiedName)
        }
    }
}

private fun interface Kla2 {
    fun fu1(): String
}

private class Kla3 {
    private val prope3 = Kla2 { "OK" }
    val prope4 = prope3.fu1()
override fun toString(): String{
var res = ""
res += prope3.toString()
res += prope4.toString()
return res
}}

private val prope2 = Kla3()

fun box266(): String = prope2.prope4


