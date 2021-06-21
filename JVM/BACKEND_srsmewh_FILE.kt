// Bug happens on JVM 
// FILE: tmp0.kt


fun fu1(init: Kla1.() -> Any = {}):Int = TODO()
class Kla1 {
    fun fu2():Int = TODO()
}
fun fu1()  = 
        fu1 {
            fu1 {
                    thislabel@::fu2
                }
        }

