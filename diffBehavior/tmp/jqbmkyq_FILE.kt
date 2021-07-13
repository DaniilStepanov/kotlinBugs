// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt


// DIFF_ONLY_IN_ADDRESSES
import kotlin.random.Random
import kotlin.reflect.*
import kotlin.reflect.*
interface A {
    fun foo(): String = (D()).foo().replaceAfterLast(D().foo(), D().foo(), D().foo())
}

abstract class B : A {
    abstract override fun foo(): String
}

abstract class C : B(),A { 
}

class D : C() {
    override fun foo(): String = "OK"
}

fun box() = Double.Companion
