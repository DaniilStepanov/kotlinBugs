// Bug happens on JVM 
// WITH_REFLECT
// IGNORE_BACKEND: ANDROID
// TARGET_BACKEND: JVM
// !JVM_DEFAULT_MODE: enable
// FILE: tmp0.kt


import kotlin.math.*
fun fu1(x: Int = 1)   = 
     when (x) {
E::class.annotations.indexOfLast{a: Any -> true} -> 1
        else -> TODO()
    }

