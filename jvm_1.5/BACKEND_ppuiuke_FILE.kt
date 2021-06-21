// Bug happens on JVM 
// FILE: tmp.kt


fun doCall1_1(): Any {
doCall2_1( {
return ""
        },TODO()  )
}
inline fun <R> doCall2_1( exception: (e: Any) -> Int,res: R  )   = 
    try {
        try {
        try {}
        catch (e: Exception) {
            exception(e)
        }
} finally {
        TODO().toString()
    }
    } finally {}

