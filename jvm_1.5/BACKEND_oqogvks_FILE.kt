// Bug happens on JVM 
// FILE: tmp0.kt


class A {
    var prop: String = TODO()
}
fun box1()   =
listOf(   A().prop.lastIndexOf( "" ).div(-1),2L.javaClass.hashCode())

