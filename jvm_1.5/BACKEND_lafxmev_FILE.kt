// Bug happens on JVM 
// FILE: tmp.kt

val mask = false.compareTo(insertWithBoxing
(     false,{ a: Int,b: Int -> })).and(TODO())
inline fun <T> insertWithBoxing(
                                equals: Any,store: (Int, T) -> Any
                                ): Boolean {
(store).equals("").compareTo(TODO())
}

