// Bug happens on JVM 
// FILE: tmp0.kt


inline fun <R> doCall2_2(block: () -> R  )   =
doCall2_1(block   )
inline fun <R> doCall2_1(block: () -> R   ): R  =
doCall2<R>( block,{
            doCall2_2<Function2<Any, Int, Int>> { { a: Any,b: Any -> 1}} .invoke(
1.toUShort(),1).toString()
}   )
inline fun <R> doCall2( block: () -> R,finallyBlock: () -> Any   )   = 
    try {
        try {
            block()
        }
finally {
            finallyBlock()
        }
    } finally {}
fun test1(): Int {
    doCall2_1{
return 1
            }
}

