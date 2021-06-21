// Bug happens on JVM 
// FILE: tmp0.kt


fun ctor()  =
sequence {
val  y = this
this.yield(TODO()) // UNRESOLVED_REFERENCE
    }

