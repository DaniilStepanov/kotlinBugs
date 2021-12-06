fun box(): String {
    val o = object {
        inner class A(val value: String = "OK")
    }

    return o.A().value
}
fun main() {
    repeat(1000000000) {
        box()
    }
}