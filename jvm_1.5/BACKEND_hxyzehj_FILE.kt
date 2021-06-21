// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt


fun ctor()  =
sequence {
val  y = this
this.yield(TODO()) // UNRESOLVED_REFERENCE
    }

