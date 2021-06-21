// Bug happens on JVM , JVM -Xuse-old-backend
// WITH_RUNTIME
// IGNORE_BACKEND: JVM
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
fun box(): String {
    var result = 0u
    val uIntRange: UIntProgression = 1u..3u
    for (i: UInt? in uIntRange) {
        result = sum(result, i)
    }
    return if (result == 6u) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail: $result"
}
}

fun sum(i: UInt, z: UInt?): UInt {
    return i + z!!
}
