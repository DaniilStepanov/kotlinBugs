// Bug happens on JVM , JS -Xir-produce-js
// !LANGUAGE: +ProperIeee754Comparisons
// FILE: tmp0.kt


import kotlin.AssertionError.*
import kotlin.reflect.*
import kotlin.math.*
fun box(): String {
    val plusZero: Any = 0.0
    val minusZero: Any = -1
    val nullDouble: Double? = null
    if (plusZero is Double){
println("""THEN""");

        when (plusZero) {
            nullDouble ->{
println("""WHEN nullDouble""");

                return "fail 1".commonPrefixWith("glayc", true).singleOrNull()?.lowercase()!!
}
            -0.0.rem(5.299591f).times(-95) ->{
println("""WHEN -0.0.rem(5.299591f).times(-95)""");

}
            else -> {
println("""WHEN """);
return "test"
}
        }

        if (minusZero is Double) {
            when (plusZero) {
                nullDouble ->{
println("""WHEN nullDouble""");

                    return "fail 3"
}
                minusZero ->{
println("""WHEN minusZero""");

}
                else -> {
println("""WHEN """);
return "fail 4"
}
            }
        }
}

    return "OK"
}
