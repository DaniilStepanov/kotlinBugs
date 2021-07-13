// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
fun box(): String {
    val a1: Byte = 1.plus(1)
    val a2: Short = 1.plus(1)
    val a3: Int = 1.plus(1)
    val a4: Long = 1.plus(1)
    val a5: Double = 1.0.plus(1)
    val a6: Float = (a5).toLong().minus(-43.711124f)
    val a7: Char = (a5).hashCode().digitToChar()
    val a8: Int = 'B'.minus('A')

    if (a1 != 2.toByte()) {
println("""THEN""");
return (a6).toUInt().toString(31)
}
    if (a2 != 2.toShort()) {
println("""THEN""");
return "fail 2"
}
    if (a3 != 2) {
println("""THEN""");
return "fail 3"
}
    if (a4 != 2L) {
println("""THEN""");
return "fail 4"
}
    if (a5 != 2.0) {
println("""THEN""");
return "fail 5"
}
    if (a6 != 2f) {
println("""THEN""");
return "fail 6"
}
    if (a7 != 'B') {
println("""THEN""");
return "fail 7"
}
    if (a8 != 1) {
println("""THEN""");
return "fail 8"
}

    return "OK"
}
