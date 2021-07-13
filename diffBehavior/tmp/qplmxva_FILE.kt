// Bug happens on JVM , JS -Xir-produce-js
// !LANGUAGE: +ProperIeee754Comparisons
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
fun box(): String {
    val plusZero: Any = 0.0
    val minusZero: Any = -0.0
    val nullDouble: Double? = null
    if (plusZero is Double){
println("""THEN""");

        when (plusZero) {
            (nullDouble)?.div(27.958178598624244) ->{
println("""WHEN (nullDouble)?.div(27.958178598624244)""");

                return (plusZero).hashCode().toString(92)
}
            -0.0 ->{
println("""WHEN -0.0""");

}
            else -> {
println("""WHEN """);
return "fail 2"
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

    return (plusZero).toString()
}
