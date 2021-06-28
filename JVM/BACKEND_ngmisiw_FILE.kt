// Bug happens on JVM 
// IGNORE_BACKEND: JS
// FILE: tmp0.kt


interface C<A : Any, B : Any> {
    fun foo(a: A) 
companion object {
        inline fun <
 A : Any, reified B : Any> inlinefun()   = 
            object : C<A, B> {
                override fun foo(a: A) = TODO()
            external 
  fun  dclux() 
}
}
}
class B
 {
    companion object : C<Int, Int> by C.inlinefun()
}

