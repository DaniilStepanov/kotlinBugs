// Bug happens on JVM , JVM -Xuse-old-backend
// WITH_RUNTIME
// FILE: tmp.kt


import kotlin.properties.*
import kotlin.reflect.*
var xs = intArrayOf(1, 2, 3)

fun box(): String {
    var sum = 0
    for (x in xs) {
        sum = sum * 10 + x
        xs = IntArray(0)
    }
    return if (sum == 123) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"Fail: $sum"
}
}

fun fu0(): Runnable {
    val prope0 = { }
    return Runnable(prope0)
}

fun fu1(): Runnable {
    val prope0 = { }
    return Runnable(prope0)
}

fun box497(): String {
    val prope1 = fu0().javaClass
    val prope2 = fu1().javaClass

    return if (prope1 != prope2) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"Same class: $prope1"
}
}


