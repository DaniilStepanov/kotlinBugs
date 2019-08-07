inline fun runNoInline(f: () -> Unit) = (f)!!

fun test() {
    runNoInline {}
}

fun main(args: Array<String>) { }