// Bug happens on JVM , JVM -Xuse-ir
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

package test

import kotlin.reflect.full.allSupertypes
import kotlin.reflect.jvm.javaType
import kotlin.test.assertEquals

interface I<T>

abstract class A<X> : Map<I<out CharSequence>, Array<List<Int>>>

fun box(): String =TODO()
