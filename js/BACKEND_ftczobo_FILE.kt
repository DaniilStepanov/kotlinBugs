// Bug happens on JVM 
// FILE: tmp0.kt


class X {
operator fun get(name: Any ) = name
}
operator fun Any.inc(): Int = TODO()
fun box()  {
    var x = X()
    ++(x[""])
}

