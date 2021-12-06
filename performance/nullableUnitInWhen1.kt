fun foo() {}

fun box(): String {
    when ("A") {
        "B" -> foo()
        else -> null
    }

    foo()

    return "OK"
}

fun main() {
    repeat(1000000000) {
        box()
    }
}