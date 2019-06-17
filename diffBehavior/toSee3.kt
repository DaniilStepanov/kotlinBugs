fun greater5(a: Any?, b: Any?) = if (a is Double && b is Double) {
    println("THEN");
    a > b
} else {
    println("ELSE");
    null!!
}


fun main(args: Array<String>) {
    println(greater5(-0.0, 0.0))
}