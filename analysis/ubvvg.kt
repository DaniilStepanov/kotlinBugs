interface A<T>
  interface Z1 : Z2, A<IllegalStateException>
interface Z2 : A<String>, BString, Int 
    