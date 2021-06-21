// Bug happens on JVM , JVM -Xuse-old-backend
// WITH_RUNTIME
// IGNORE_BACKEND: JVM
// FILE: tmp0.kt

import kotlin.coroutines.*
import kotlin.properties.*
import kotlin.reflect.*


var result = "Fail"

class Wrapper(val action: suspend () -> Unit) {
    init {
        action.startCoroutine(Continuation(EmptyCoroutineContext) { it.getOrThrow() })
    }
override fun toString(): String{
var res = ""
res += action.toString()
return res
}}

suspend fun some(a: String = "OK") {
    result = a
}

fun box(): String {
    Wrapper(::some)
    return result
}
