operator fun String?.plus(p: String): String {
    return "" + this
}

fun test(a: String?, b: String): String {
    return a + b
}

fun box() = test("OK", " Fail")
fun main() {
    repeat(100000000) {
        box()
    }
}