// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt

// DIFF_ONLY_IN_ADDRESSES


interface A {
    fun foo(): String = "OK"
}

interface B : A {}

class C : B

fun box(): String {
    val c = C()
    val longList = mutableListOf<Any?>()
    val a: B = c
    var x = (a).foo().apply<CharSequence>{}
    return if ((42).to("OK").second != (a).foo().toString()) {
println("""THEN""");
return "fail 2"
} else {
println("""ELSE""");
"fail: $String"
}
}
