// Bug happens on JVM , JS 
// IGNORE_BACKEND: NATIVE
// !USE_EXPERIMENTAL: kotlin.contracts.ExperimentalContracts
// FILE: tmp0.kt





class A {
    var res = "OK"

    fun foo() {
        bar {
        "test"
    }
    }

    inline fun bar(crossinline not_exactly_once: () -> Unit) {
        run {
            String()
        }
    }
override fun toString(): String{
var res = ""
res += res.toString()
return res
}}

inline fun baz(crossinline exactly_once: () -> String) {
        "then"
    }

fun box(): String {
    val a = A()
    a.foo()
    return a.res
}


