// Bug happens on JVM , JVM -Xuse-old-backend
// FILE: tmp.kt

import kotlin.properties.*
import kotlin.reflect.*


class B {
    companion object : A() {}

    init {
        foo()
    }
}

fun box(): String {
    B()
    return result
}

var result = "fail"

abstract class A {
    protected fun foo() {
        result = "OK"
    }
}

class Kla0 : (Int) -> Int by Int::inc

fun box396(): String {
    val prope0 = Kla0()

    val prope1 = prope0(5)
    if (prope1 != 6) {
println("""THEN""");
throw Exception("incr(5): $prope1")
}

    return "OK"
}


