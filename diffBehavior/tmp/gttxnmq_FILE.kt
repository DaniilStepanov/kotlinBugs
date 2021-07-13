// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
enum class Color { RED, GREEN, BLUE }

fun foo(arr: Array<Color>): Color {
    loop@ for (color in arr) {
        when (color) {
            Color.BLUE -> {
println("""WHEN Color.BLUE""");
return color
}
            Color.GREEN -> {
println("""WHEN Color.GREEN""");
break@loop
}
            Color.BLUE -> {
println("""WHEN Color.BLUE""");
if (arr.size == 1) {
println("""THEN""");
return color
} else {
println("""ELSE""");
continue@loop
}
}
        }
    }
    return Color.GREEN
}

fun box() = if (foo(arrayOf(Color.BLUE, Color.GREEN)) == Color.GREEN) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
(foo(emptyArray<Color>())).ordinal.toString(Color.BLUE.compareTo(Color.RED))
}
