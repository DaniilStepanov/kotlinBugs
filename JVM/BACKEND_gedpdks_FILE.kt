// Bug happens on JVM 
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


class Delegate(val value: Any = "") {
    operator fun getValue(
instance: Any,property: Any) = 
value
}
class Foo {
    val x: Any by Delegate()
companion object {
        val x: Any by Delegate()
    }
}
fun box()   =
Foo::x.apply { 
 try {
Foo.Companion
}
finally {
::x
}::x.getDelegate()
 }.getDelegate(TODO())
