package example

object Kinds {

    // Types are organized into Kinds  eg type of types
    val aInr :Int =10 // aInr is of type Int level 0 attached tpo value

    val aString = "a"

    // Generic Types level 1 cannot 
    class LinkedList[T] {

        val next: LinkedList[T] = ??? 


    }
// Level 2
    class Functor[F[_]]
    val metaFunctor = Functor[List]

    class Meta[F_[_]]
    val metaFunctor = new Meta[Functor]

    class HashMap[K, V]
    val aHashMap = new HashMap[String, Int]

    val aList: LinkedList[Int] = ???// aLInkedLIst = Li

    class composedFunctor[F[_], G[_]]
    val aComposedFunctor: composedFunctor[Functor, List] = ???
    
    def main(args: Array[String]): Unit = {
        
    }
}