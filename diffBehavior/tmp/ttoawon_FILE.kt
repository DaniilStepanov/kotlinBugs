// Bug happens on JVM , JS -Xir-produce-js
// WITH_RUNTIME
// IGNORE_BACKEND: JS, JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
fun box(): String {
    suspend fun bar() {}
    suspend fun baz() {}

    if (!::bar.equals(::bar)) {
println("""THEN""");
return "Fail 1"
}
    if (::bar.hashCode() != ::bar.hashCode()) {
println("""THEN""");
return "Fail 2"
}

    if (::bar == ::baz) {
println("""THEN""");
return "Fail 3"
}

    return "OK"
}
