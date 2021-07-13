// Bug happens on JVM , JS 
// IGNORE_BACKEND: NATIVE
// FILE: tmp0.kt

//For KT-6020

import kotlin.reflect.*
import kotlin.properties.*
import kotlin.math.*

class Value<T>(var value: T = null as T, var text: String? = null){
override fun toString(): String{
var res = ""
res += value.toString()
res += text.toString()
return res
}
}

val <T> Value<T>.additionalText by DVal(Value<T>::text) //works

val <T> Value<T>.additionalValue by DVal(Value<T>::value) //not work

class DVal<T, R, P: KProperty1<T, R>>(val kmember: P) {
    operator fun getValue(t: T, p: KProperty<*>): R {
        return kmember.get(t)
    }
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    val p = Value("O", "K")
    return p.additionalValue + p.additionalText
}

private object Kla0 : MutableList<Any> {
    override fun contains(element: Any): Boolean = true
    override fun indexOf(element: Any): Int = 0
    override fun lastIndexOf(element: Any): Int = 0
    override fun remove(element: Any): Boolean = true

    override val size: Int
        get() = throw UnsupportedOperationException()

    override fun containsAll(elements: Collection<Any>): Boolean = elements.isEmpty()
    override fun isEmpty(): Boolean = throw UnsupportedOperationException()
    override fun get(index: Int): Any = throw UnsupportedOperationException()
    override fun add(element: Any): Boolean = throw UnsupportedOperationException()
    override fun addAll(elements: Collection<Any>): Boolean = throw UnsupportedOperationException()
    override fun addAll(index: Int, elements: Collection<Any>): Boolean = throw UnsupportedOperationException()
    override fun removeAll(elements: Collection<Any>): Boolean = throw UnsupportedOperationException()
    override fun retainAll(elements: Collection<Any>): Boolean = throw UnsupportedOperationException()
    override fun clear(): Unit = throw UnsupportedOperationException()
    override fun set(index: Int, element: Any): Any = throw UnsupportedOperationException()
    override fun add(index: Int, element: Any): Unit = throw UnsupportedOperationException()
    override fun removeAt(index: Int): Any = throw UnsupportedOperationException()
    override fun listIterator(): MutableListIterator<Any> = throw UnsupportedOperationException()
    override fun listIterator(index: Int): MutableListIterator<Any> = throw UnsupportedOperationException()
    override fun subList(fromIndex: Int, toIndex: Int): MutableList<Any> = throw UnsupportedOperationException()
    override fun iterator(): MutableIterator<Any> = throw UnsupportedOperationException()
}

fun box456(): String {
    val prope0 = Kla0 as MutableList<Any?>

    if (prope0.contains(null)) {
println("""THEN""");
return "fail 1"
}
    if (prope0.indexOf(null) != -1) {
println("""THEN""");
return "fail 2"
}
    if (prope0.lastIndexOf(null) != -1) {
println("""THEN""");
return "fail 3"
}

    if (!prope0.contains("")) {
println("""THEN""");
return "fail 3"
}
    if (prope0.indexOf("") != 0) {
println("""THEN""");
return "fail 4"
}
    if (prope0.lastIndexOf("") != 0) {
println("""THEN""");
return "fail 5"
}

    if (prope0.remove(null)) {
println("""THEN""");
return "fail 6"
}
    if (!prope0.remove("")) {
println("""THEN""");
return "fail 7"
}

    return "OK"
}


