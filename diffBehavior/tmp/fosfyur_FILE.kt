// Bug happens on JVM , JS -Xir-produce-js
// !LANGUAGE: +VariableDeclarationInWhenSubject
// FILE: tmp0.kt


// DIFF_ONLY_IN_ADDRESSES
val x = 0

fun box() =
    when (val p = x) {
        in 2000000000L..3333333333L -> {
println("""WHEN in 2000000000L..3333333333L""");
"fail"
}
        else -> {
println("""WHEN """);
arrayOfNulls<String>(0)
}
    }
