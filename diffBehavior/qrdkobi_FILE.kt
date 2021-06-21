// Bug happens on JVM , JVM -Xuse-old-backend
// FILE: tmp.kt

import kotlin.reflect.KProperty
import kotlin.properties.*
import kotlin.reflect.*


class Delegate {
    operator fun getValue(t: Any?, p: KProperty<*>): Int = 1
}

interface A {
    val prop: Int
}

class AImpl: A  {
  override val prop: Int by Delegate()
override fun toString(): String{
var res = ""
res += prop.toString()
return res
}}

fun box(): String {
  return if(AImpl().prop == 1) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail"
}
}

fun fu0(result: String = "OK") = (AImpl().prop).toChar().lowercase()

fun box368(): String = ::fu0.callBy(mapOf())

abstract class Kla0<Ty0 : Kla2> {
    lateinit var prope0: Ty0

    open fun fu1(): String {
        prope0 = fu2()
        return "Fail"
    }

    abstract fun fu2(): Ty0
override fun toString(): String{
var res = ""
if (this::prope0.isInitialized){
println("""THEN""");

res += prope0.toString()
}
return res
}}

class Kla1 : Kla0<Kla3>() {
    override fun fu1(): String {
        super.fu1()

        return fu3(prope0::prope1)
    }

    override fun fu2(): Kla3 = Kla3()
    inline fun <Ty0> fu3(crossinline viewModelGet: () -> Ty0?): String {
        return fu4 { viewModelGet() as String }
    }

    fun fu4(l: () -> String): String {
        return l()
    }
}

abstract class Kla2

class Kla3 : Kla2() {
    var prope1: String? = "OK"
override fun toString(): String{
var res = ""
res += prope1.toString()
return res
}}

fun box269(): String {
    return Kla1().fu1()
}


