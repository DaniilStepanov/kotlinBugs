// Bug happens on JVM 
// FILE: tmp0.kt


fun call(s: (Int) -> Int ): Int = TODO()
fun box1()   =
call{a: Int -> 
 try {
::calc
}
finally {}
} .toString()

