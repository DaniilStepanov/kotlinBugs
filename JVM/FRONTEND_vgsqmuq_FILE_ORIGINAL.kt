// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
interface BK {
    fun foo(): String = 10.toString()
}

interface KTrait: BK {
    override fun foo() = 30.toString().compareTo(A().foo()).toString(4)
}

class A : BK, KTrait {

}

fun box(): String {
    return if (A().foo() == "30") "OK" else "fail"
}
