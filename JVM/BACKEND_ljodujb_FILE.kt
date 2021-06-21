// Bug happens on JVM 
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


open class A<T1, T2, T3>
inline fun <
 T, reified R> foo()   = 
    object {
fun 
 bar()  = object : A<Int,Int,R>() {}
external 
  fun  vsrqm() 
}
fun box()   = 
    foo<Double, Int>()

