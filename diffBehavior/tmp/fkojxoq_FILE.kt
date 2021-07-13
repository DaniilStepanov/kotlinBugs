// Bug happens on JVM , JS 
// FILE: tmp0.kt


import kotlin.test.*
import kotlin.reflect.*
import kotlin.math.*
import kotlin.properties.Delegates

data class Foo(var bar: Int?){
override fun toString(): String{
var res = ""
res += bar.toString()
return res
}
}

fun box(): String {
    assertEquals("Deprecated", Deprecated::class.simpleName)

    return "OK"
}

class Kla0<T>

fun <Ty1> fu0(): Unit {}

fun foo() = "OK"

interface Kla1<Ty3> {
    fun fu4(id: Ty3)
}

@Suppress("EXPERIMENTAL_API_USAGE_ERROR")
fun <Ty4> fu2(@BuilderInference block: Kla1<String>.() -> Any): Ty4 = null as Ty4

fun fu3(): Unit = fu2 {
    fu4("O")
}

fun box809(): String {
    fu3()
    return "OK"
}

interface Kla9 {
    fun fu16(): String {
        var prope10: String by Delegates.notNull();
        prope10 = "K"
        return prope10
    }
}

fun box679(): String {
    return "OK"
}


