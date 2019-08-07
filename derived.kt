fun main() {
    val three = 3

    open class Local {
        val a = three
    }

    data class Derived(val b: Int) : Local()
}