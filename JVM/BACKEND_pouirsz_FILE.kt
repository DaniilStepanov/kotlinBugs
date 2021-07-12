// Bug happens on JVM 
// FILE: tmp0.kt


@Suppress( "INVISIBLE_MEMBER","INVISIBLE_REFERENCE")
@kotlin.internal.LowPriorityInOverloadResolution
fun fu1(java: Any) = 1
fun fu1(a: Any) = TODO().get(TODO())

