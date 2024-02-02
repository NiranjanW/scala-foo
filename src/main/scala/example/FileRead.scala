package example
import scala.util.{Try, Success, Failure}
import Control._

object FileRead extends App {
    def readFile( File :String) :Try[List[String]]= {
        Try {
             val lines = using(io.Source.fromFile(File)) { source => 
             (for (line <- source.getLines) yield line).toList
             }
            lines
        }
       
    }

    val passedFile = readFile("/Users/itnxw/scala/foo-build/data/Get Leases.json")
    passedFile match {
        case Success(lines) => lines.foreach(println)
        case Failure(s) => println("Failed Message: + $s" )
    }

    def map [A,B](F:(B) => A ,xs:List[B]):List[A] = xs.map(F)

}

import scala.language.reflectiveCalls

object Control {
    def using[A <: { def close(): Unit }, B](resource: A)(f: A => B): B =
        try {
            f(resource)
        } finally {
            resource.close()
        }
}