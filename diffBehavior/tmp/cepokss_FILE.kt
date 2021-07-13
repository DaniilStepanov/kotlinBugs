// Bug happens on JVM , JS -Xir-produce-js
// !LANGUAGE: +ProperFinally
// FILE: tmp0.kt


import kotlin.test.*
import kotlin.reflect.*
import kotlin.math.*
var result = ""

fun test() {
    try{
println("""TRY""");

        try {
            try {
                result += "try"
                return
            } catch (nil: Throwable) {
                result += "O"
            }
        } finally {
            result += " finally 1"
            throw RuntimeException("OK")
        }
} finally{
println("""FINALLY""");

        result += " finally 2"
        throw RuntimeException("Fail 2")
}
}

fun box(): String {
    try{
println("""TRY""");

        test()
        return "OK"
} catch (e: Throwable){
println("""CATCH e: Throwable""");

        return "Unexpected exception: ${e::class}"
}

    return if (result == "try finally 1 finally 2") {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail"
}
}
