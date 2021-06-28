// Bug happens on JVM 
// WITH_RUNTIME
// FILE: tmp0.kt


fun box()  {
    var sum = 1
    for (i: Int? in sum.floorDiv(sum) downTo sum.toULong().countTrailingZeroBits()) 
        sum
}
