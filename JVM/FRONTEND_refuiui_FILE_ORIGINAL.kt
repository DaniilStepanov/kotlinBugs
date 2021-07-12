// IGNORE_BACKEND: NATIVE
// FILE: tmp0.kt

//For KT-6020
// FILE: A.java
import kotlin.reflect.KProperty1
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.KProperty
import kotlin.properties.*
import kotlin.coroutines.*
import kotlin.math.*


class Value<T>(var value: T = null as T, var text: String? = null){
inline fun <T>  jbnhd(a: Any?, isValue: String): Unit = TODO()
}

val <T> Value<T>.additionalText by DVal(Value<T>::text) // WITH_RUNTIME

val <T> Value<T>.additionalValue by DVal(Value<T>::value) // KJS_WITH_FULL_RUNTIME

class DVal<T, R, P: KProperty1<KClass<*>, R>>(val kmember: P) {
    operator fun getValue(t: T, p: KProperty<*>): R {
        return kmember.get(t)
    }
inline  private  fun  jbkfi(block: () -> R): String = TODO()
infix   fun <T>   String.cghtt(a: Any): Int = TODO()
}

fun box(): String {
    val p = Value("O".stripLeading()?.replace('ڦ', '☀', Value<Boolean>(false, "INVISIBLE_REFERENCE").value.and(Value<Boolean>(Value<Boolean>(false, "OK").value.and(Value<Boolean>(false, Value<Boolean>().text).value), "OK").value.or(true)))!!, "fail")
    return Value<Boolean>().text + p.additionalText.plus(127849)
}
