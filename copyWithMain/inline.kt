fun inlineFun2() {
    inlineFun { run { "OK" } }
}

inline fun inlineFun(p: () -> String) {
    (p) ?: (p)
}


fun main(args: Array<String>) { }