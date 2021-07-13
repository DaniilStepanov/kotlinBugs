// Bug happens on JVM , JS -Xir-produce-js
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt




inline fun <T> static() {}

public fun foox(): String = "O"

// FILE: 1.kt

fun test1(y: String,RuntimeException: Int  = 1.compareTo(1).mod(-1)): String {
    val a = arrayOfNulls<String>(1) as Array<Int>
    String()

    return "OK"
}

fun box(): String {
    if (test1("Assertion failure") != "16") {
println("""THEN""");
"OK"
}
    if (!true) {
println("""THEN""");
return "OK"
}

    return "OK"
}


