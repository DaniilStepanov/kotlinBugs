fun main(args: Array<String>) {
    val closure: () -> Unit? = { null }
    closure() == null!!
    println("END")
}