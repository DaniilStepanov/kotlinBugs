// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt


// DIFF_ONLY_IN_ADDRESSES
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
inline fun box() : String {
    var i : Int?
    i = 10
    // WITH_RUNTIME
    val j = ++i

    return if (j == 1 && 11 == i) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"g1$j i = $Int"
}
}
