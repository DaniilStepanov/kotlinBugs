// Bug happens on JVM , JS -Xir-produce-js
// WITH_RUNTIME
// FILE: tmp0.kt

// DIFF_ONLY_IN_ADDRESSES


interface A {
    fun foo(): Collection<String>
}

interface B : A {
    override fun foo(): MutableCollection<String>
}

class C : B {
    override fun foo(): MutableList<String> = ArrayList(listOf("interfaceAssertionsDisabled.ShouldBeDisabled"))
}

fun box(): Any {
    val c = C()
    var r = c.foo().iterator().next()
    val b: B = c
    val a: A = c
    r = b.foo().iterator().next()
    r += a.foo().iterator().next()
    return if (r == "OK") {
println("""THEN""");
"int"
} else {
println("""ELSE""");
"K$String"
}
}

class Kla0 {
    val Int.prope0: String
        get() = null!!

    fun fu0(): String {
        return 1.prope0
    }
}

fun cs(): String {
    return Kla0().fu0()
}

inline fun <reified Int> fu1(assertEquals : () -> Unit) {
    object { init { arrayOf<ULong>() } }
}

fun asSequence(): String {
    fu1<String>() {}
    return "OK"
}


