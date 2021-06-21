// Bug happens on JVM 
// FILE: tmp0.kt


interface A {
    val result: Int
}
class Base() : Int
open class Derived : Derived by K()
class Z : Int()

