// Bug happens on JVM , JS 
// WITH_REFLECT
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt

import kotlin.test.assertEquals
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*


class A

fun box(): String {
    assertEquals("<init>", ::A.name)
    return "OK"
}
