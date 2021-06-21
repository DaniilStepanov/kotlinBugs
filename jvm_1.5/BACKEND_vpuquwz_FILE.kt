// Bug happens on JVM 
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


interface A {
    fun <T> aTest(p: T) 
}
inline fun <
 T> test(crossinline z: () -> Int) = object : A {
        override fun <T> aTest(p: T)  {
            z()
}
external 
  fun 
  hzafa() 
}
fun callInline() =  test<Int> { 1 }

