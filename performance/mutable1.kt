fun box(): String {
    var result = ""
    fun add(s: String) {
        result += s
    }
    add("O")
    add("K")
    return result
}
fun main() {
    repeat(100000000) {
        box()
    }
}