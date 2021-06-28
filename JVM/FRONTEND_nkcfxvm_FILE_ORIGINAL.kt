// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*
import kotlin.reflect.full.*
import kotlin.coroutines.*
import kotlin.reflect.KProperty


class Value(val it: Int = 0) : Comparable<Comparable<Value>> {
    override fun compareTo(pv: Value): Int {
        throw RuntimeException()
    }
}

class ValueRange(override val start: Value = Value(12),
                 override val endInclusive: Value = Value(-4)) : ClosedRange<Value> {

    inline fun test(s: (String) -> Int) {
    s("456")
}
}

fun local(){
        {
            //static instance access
            local()
        }()
    }

fun l(): String {
    assertTrue(Value() in Value()..Value(2))
    assertTrue(Value() !in Value(40)..Value(-239))

    return "fail"
}

fun fu0(): () -> Unit {
    return {
        runCatching { "BOOYA" }
    }
}

fun box229(): String {
    var str2: String = ""
    return "OK"
}


