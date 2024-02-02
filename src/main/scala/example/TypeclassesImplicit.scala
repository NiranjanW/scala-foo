package example

// Implicit TYpes
object TypeclassesImplicit {
   
   trait Summable[T] {
        def sumElements( xs:List[T] ):T
   }

   implicit object IntSummable extends Summable[Int] {
        def sumElements( xs:List[Int] ):Int = xs.sum
   }

   implicit object StringSummable extends Summable[String] {
        def sumElements( xs:List[String] ):String = xs.mkString
   }
// addhoc polymorphism
   def processMyList[T]( xs:List[T] )( implicit summable:Summable[T] ):T = {
        summable.sumElements(xs)
   }

   def main (args:Array[String]):Unit = {
        val IntSummable = processMyList(List(1,2,3,4,5))
        val StringSummable = implicitly[Summable[String]]
        println( IntSummable.sumElements(List(1,2,3,4,5)) )
        println( StringSummable.sumElements(List("a","b","c","d","e")) )

   }
}