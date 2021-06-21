// Bug happens on JVM 
// FILE: tmp.kt

import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty
var property: String? by equalVetoingObservable<String?>(TODO(),{})
inline fun <T> equalVetoingObservable(
 initialValue: T,onChange: () -> Any) =
        object : ObservableProperty<T>(initialValue) {
            override fun beforeChange( property: KProperty<*>,oldValue: T,newValue: T ) = (onChange).equals("").xor(TODO())
}

