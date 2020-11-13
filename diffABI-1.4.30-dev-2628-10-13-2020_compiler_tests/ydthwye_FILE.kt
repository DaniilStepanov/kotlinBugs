// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

inline class FieldValue(val value: String)

enum class RequestFields {
    ENUM_ONE
}

class RequestInputParameters(
    private val backingMap: Map<RequestFields, FieldValue>
) : Map<RequestFields, FieldValue> by backingMap

fun box(): String =TODO()
