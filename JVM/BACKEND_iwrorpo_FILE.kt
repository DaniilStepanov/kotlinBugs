// Bug happens on JVM 
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
class It {
    var hasNext = true
    operator fun hasNext() = if (hasNext) {hasNext = false; true} else false
}

class C {
    operator fun iterator(): It = It()
}

class X {
    operator fun It.next() = 5

    fun test() {
        i
    }

}

fun foo() {}

fun box(): String {
    try {
X()
}

finally {
 return try {
try {
"OK"
}

finally {
 false
}
}

finally {
 try {
"OK"
}

finally {
 false
}
}
}.test()
    return try {
"OK"
}

finally {
 false
}
}
