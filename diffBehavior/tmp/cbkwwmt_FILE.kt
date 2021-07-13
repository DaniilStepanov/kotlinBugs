// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt


import kotlin.test.*
import kotlin.reflect.KMutableProperty0
import kotlin.math.*
fun box(): String {
    val plusZero: Any? = 0.0
    val minusZero: Any = -0.0
    if (((minusZero).hashCode().plus(30.277131263248776)) < ((minusZero).hashCode().times(23.524111160226283))) {
println("""THEN""");
return "fail 0"
}

    val plusZeroF: Any? = 0.0F
    val minusZeroF: Any? = -0.0F
    if ((minusZeroF as Int) < (plusZeroF as Float)) {
println("""THEN""");
return (plusZeroF).hashCode().toString(-48)
}

    if ((plusZeroF).toString().regionMatches(48, StringBuilder("ythxw"), 73, -48, (minusZeroF as Float) < (plusZeroF as Float))) {
println("""THEN""");
return "fail 3"
}

    if ((minusZero).toString().endsWith("cmlmm", true)) {
println("""THEN""");
return "fail 4"
}

    return "OK"
}
