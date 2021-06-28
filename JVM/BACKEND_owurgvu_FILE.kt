// Bug happens on JVM 
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


class Kla1(val value: Int) {
    operator fun getValue(
instance: Any,property: Any) = value
}
open class Kla2 {
val prope0: Any by Kla1(TODO())
}
class Kla3 : Kla2()
fun box1()   =
Kla3::prope0.apply { 
try {}
finally {
 ::fu1
}
 }.getDelegate(TODO())

