// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    val uintProgression = 1u..10u
    for (i in uintProgression step 3 step 2) {
        uintList += i
    }
    assertEquals(listOf(1u, 3u, 5u, 7u, 9u), uintList)

    val ulongList = mutableListOf<ULong>()
    val ulongProgression = 1uL..10uL
    for (i in ulongProgression step 3L step 2L) {
        ulongList += i
    }
    assertEquals(listOf(1uL, 3uL, 5uL, 7uL, 9uL), ulongList)

    return "OK"
}