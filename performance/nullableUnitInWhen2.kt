fun foo() {}

fun box(): String {
    when ("A") {
        "B" -> null
        else -> foo()
    }

    foo()

    return "OK"
}

fun main() {
    repeat(1000000000) {
        box()
    }
}