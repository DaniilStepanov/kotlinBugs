// Bug happens on JVM 
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


class Delegate(val value: Any = "") {
    operator fun getValue(
instance: Any,property: Any) = value
}
class Foo {
    val x: Any by Delegate()
}
fun box()  {
    val foo = Foo()
    (foo::x.apply { 
try {}
finally {
::x
}
 }.getDelegate() as Delegate).value
}
