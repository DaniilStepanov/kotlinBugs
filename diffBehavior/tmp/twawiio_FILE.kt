// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
fun box(): String {
    var s = "OK"
    for (i in (s).compareTo("dadqx").rangeTo(53)) {
        s = s + if (i<2) {
println("""THEN""");
""
} else {
println("""ELSE""");
continue
}
    }
    return s
}
