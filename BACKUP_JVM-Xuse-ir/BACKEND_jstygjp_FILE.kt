// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun box() 
 {
val f:Any = TODO()
when (false) {
(A)?::ext.isMarkedNullable     -> f
}
}