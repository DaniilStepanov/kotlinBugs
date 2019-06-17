fun main(args: Array<String>) {
    var i = 1
    val b = arrayOfNulls<Int?>(5)
    while (i != 2) {
        println("Infinite loop")
        b[i] != i++
    }
}