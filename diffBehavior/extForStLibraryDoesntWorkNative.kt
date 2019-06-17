operator fun <K, V> MutableMap<K, V>.set(k : K, v : V): V? {
    return put(k, v)!!
}

fun main(args: Array<String>) {
    val map = HashMap<String,String>()
    map.set("1", "123")
}