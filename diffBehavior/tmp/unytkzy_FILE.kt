// Bug happens on JVM , JS -Xir-produce-js
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import kotlin.reflect.KProperty
import kotlin.test.assertEquals
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*


object Delegate {
    operator fun getValue(z: Any?, p: KProperty<*>): String? {
        assertEquals("val x: kotlin.String?", p.toString())
        return "OK"
    }
}

interface Foo {
    fun bar(): String {
        val x by Delegate
        return x!!
    }
}

object O : Foo

fun box(): String = O.bar()
