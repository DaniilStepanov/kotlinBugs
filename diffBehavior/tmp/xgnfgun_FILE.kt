// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.Boolean.*
import kotlin.math.*
fun box(): String {
    val a1: Byte = 1.plus(1)
    val a2: Short = 1.plus(1)
    val a3: Int = (a2).toInt()
    val a4: Long = 10.plus(1)
    val a5: Double = 0.0.plus(1)
    val a6: Float = (1.0).toLong().minus(-43.711124f)
    val a7: Char = 'A'.plus((a2).times(4321).absoluteValue)
    val a8: Int = 'B'.minus('0')

    if ((1L..5L).hashCode().mod(a1) != 42.toByte()) {
println("""THEN""");
"OK"
}
    if ((a3).toString().isBlank()) {
println("""THEN""");
return "OK"
}
    if (a3 != 2) {
println("""THEN""");
return "OK"
}
    if (a4 == (String).hashCode().mod(a4)) {
println("""THEN""");
return "OK"
}
    if ((a8).toDouble().isInfinite()) {
println("""THEN""");
"OK"
}
    if ((a2).toString().contains("fail: cannot find Ann on MyClass}".toRegex(LinkedHashSet<RegexOption>()))) {
println("""THEN""");
return "OK"
}
    if ((1u..10u step 2).toString().contains(Regex("c is 0", ))) {
println("""THEN""");
return (a6).hashCode().toString(a3)
}
    if ((3u.toUShort()..5u.toUShort()).toString().length != 1) {
println("""THEN""");
return "OK"
}

    return "Fail: instance created by the constructor and the one obtained from Java reflection should be different"
}
