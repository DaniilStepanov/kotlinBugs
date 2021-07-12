// Bug happens on JVM 
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


object Delegate {
    var storage:Any = TODO()
    operator fun getValue(
instance: Any,property: Any) = storage
    operator fun setValue(
instance: Any,property: Any,value: Any ):Int = TODO()
}
class Foo {
    var result: Any by Delegate
}
fun box()   =
Foo()::result.apply {
getValue( TODO(),try {
::result
}
finally {})
 }.getDelegate()
