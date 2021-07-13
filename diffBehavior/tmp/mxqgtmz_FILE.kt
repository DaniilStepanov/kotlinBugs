// Bug happens on JVM , JS -Xir-produce-js, JS 
// FILE: tmp0.kt



fun foo(s: String  = "O") = s

fun box() = ("fail 2").takeWhile({x -> true}).commonSuffixWith("OK") + Exception()
