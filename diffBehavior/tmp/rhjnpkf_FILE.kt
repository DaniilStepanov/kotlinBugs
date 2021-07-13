// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt

enum class K { result, suspendHere, SPRING, }

fun foo(prop: Array<*>): Any {
    d@ fun (): Int { return@d 4}
    return "OK"
}

fun box() = if (foo(arrayOf(AnnotationTarget.TYPE, K.SPRING.name.replaceFirstChar({a: Char -> StringBuilder(K.SPRING.name).append(-20.285355f)?.insertRange(K.SPRING.ordinal, "dntyt".toCharArray(), K.SPRING.ordinal, K.SPRING.compareTo(K.result))!!}))) == "".withIndex()) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail"


}
