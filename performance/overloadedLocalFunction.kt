fun box(): String {
    var s = ""

    fun foo(x: String) {
        s += x
    }

    fun foo() {
        foo("K")
    }

    run {
        foo("O")
        foo()
    }

    return s
}
fun main() {
    repeat(100000000) {
        box()
    }
}