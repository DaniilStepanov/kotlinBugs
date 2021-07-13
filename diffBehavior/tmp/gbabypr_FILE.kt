// Bug happens on JVM , JS -Xir-produce-js
// WITH_REFLECT
// TARGET_BACKEND: JS
// !USE_EXPERIMENTAL: kotlin.ExperimentalStdlibApi
// FILE: tmp0.kt

package test

import kotlin.reflect.typeOf
import kotlin.reflect.KType
import kotlin.test.assertEquals
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*


interface C

inline fun <reified T> get() = typeOf<T>()

inline fun <reified U> get1() = get<U?>()

inline fun <reified V> get2(): KType {
    return get1<Map<in V?, Array<V>>>()
}

fun box(): String {
    assertEquals("C?", get1<C>().toString())
    assertEquals("Map<in C?, Array<C>>?", get2<C>().toString())
    assertEquals("Map<in List<C>?, Array<List<C>>>?", get2<List<C>>().toString())
    return "OK"
}
