// Bug happens on JVM 
// FILE: tmp.kt

fun profile(f: Any):Int = TODO()
inline fun <R : Any> DoubleArray.maxBy2(selector: () -> R)   = 
(selector).equals("").compareTo(TODO())
fun main() {
    val doubleArray = 
TODO()
profile {
        doubleArray.maxBy2 {}
}
}

