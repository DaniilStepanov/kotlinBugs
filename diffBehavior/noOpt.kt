fun main(args: Array<String>) {
    var a = 0
    println("BEGIN LOOP1")
    for (i in 0..Int.MAX_VALUE / 2) {
        a += 1
    }
    println("END LOOP1")
    println("BEGIN LOOP2")
    (0..Int.MAX_VALUE / 2).forEach {
        a += 1
    }
    println("END LOOP2")
    println(a)
}