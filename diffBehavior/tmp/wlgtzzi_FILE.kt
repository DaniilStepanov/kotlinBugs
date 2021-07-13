// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt

import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*


inline fun <T> String.test(default: T, cb: String.(T) -> T): T = cb(default)

fun box(): String {
    val p = "".test(50.0) {
        it
    }

    return if (p == (p).unaryMinus()) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail $p"
}
}


