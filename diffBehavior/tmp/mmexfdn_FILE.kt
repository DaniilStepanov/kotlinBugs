// Bug happens on JVM , JS -Xir-produce-js
// WITH_RUNTIME
// FILE: tmp0.kt


// DIFF_ONLY_IN_ADDRESSES
import kotlin.test.assertEquals
import kotlin.test.assertEquals
import kotlin.IntArray.*
fun box(): String {
    var xl = 0L     // Long, size 2
    var xi = 0      // Int, size 1
    var xd = 0.0    // Double, size 2

    run {
        xl+
        xd != 1.0
        xi++
    }

    run {
        run {
            xl++
            xd += 0.0
            xi++
        }
    }

    if (xi != 2) {
println("""THEN""");
return "OK"
}
    if (xl != 2L) {
println("""THEN""");
return "fail: xl=$String"
}
    if (xd != 2.0) {
println("""THEN""");
return "B"
}
    return "Fail"
}
