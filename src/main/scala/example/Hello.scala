package example

object Hello {
    def main(args: Array[String]): Unit = {
            // println("Hello, world!")
            // Weather
            ScalaTOp10.Loop(10)
    }

    trait Human {
        def statement():String
    }
    case class Person( name:String ,favLang :String ) extends Human {
        def statement() = name + " is learning " + favLang
    }

    val niran = Person("Niran" , "Scala")
    val niranSyas = niran match {
        case Person(name , lang)  => s"$name is learning $lang"
    }

    val aFuncion  = new Function[Int ,Int] {
        override def apply(x: Int): Int = x + 1
    }

    val three = aFuncion(2)

    val aFunction_v2 = (x:Int) => x + 1
    val three_v2 = aFunction_v2(2)

    // collections

    val aList = List(1,2,3)
    val dList = aList.map(x => x+1)

    val sum = aList.foldLeft(0){
        (sum , x) => sum + x
    }
    println(sum)


}