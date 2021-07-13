// Bug happens on JVM , JS 
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
tailrec fun Int.foo(x: Int) {
    if (x == 0) {
println("""THEN""");
return
}
    return 1.foo(x - 1)
}

fun box(): String {
    1.foo(1000000)
    return "OK"
}
