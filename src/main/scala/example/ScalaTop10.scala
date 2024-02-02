
 package example

//  Looping through recursion  

object ScalaTOp10 {
def Loop (n:Int = 0) :Unit =  {
    if (n != 1) {
        println("Hello World")
        Loop(n-1)
    }
    
    // if ( n < 10)
    //     Loop(n+1)
    }

    // val connection = config.get("host").flatMap { h => 
    //     config.get("port").flatmap { p => 
    //     Connection(h, p).map(_.connect) 
    // }
    // }

    // val connection1 = for {
    //     h <- conf.get("port")
    //     conn = Connig.get("host")
    //     p <- configection(h, p)
    // }yield conn

    // connection.foreach(_.close)

}
