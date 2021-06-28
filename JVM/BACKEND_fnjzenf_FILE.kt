// Bug happens on JVM 
// FILE: tmp0.kt












public class Holder {
    public var value: String = TODO()
}

public inline fun <R> doCall2_2( block: () -> R,res: R,h: Holder )  {
    try {
         doCall2_1( block,{
            h.value
            ""
        },res,h  )
    } finally{
        (doCall2_1<UByte>( {},{ 31.toUByte()},9.toUByte(),Holder()  )).compareTo(TODO()).toString()
    }
}

public inline fun <R> doCall2_1( block: () -> R,exception: (e: Exception) -> Unit,res: R,h: Holder  ): R {
    
        return doCall2<R>( block,exception,{
            h.value
            ""
        },res   )
    
}

public inline fun <R> doCall2( block: () -> R,exception: (e: Exception) -> Unit,finallyBlock: () -> Unit,res: R   ): R {
    
        try {
            return block()
        }
        catch (e: Exception) {
            exception(e)
        }
        finally {
            finallyBlock()
        }
    
    return res
}


fun test0( h: Holder,throwException: Boolean): Int {
    doCall2_2 (
            {
                h.value
                throwException
                return 1
            },"",h
            )

    return 1;
}





