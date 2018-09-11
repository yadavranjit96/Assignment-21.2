object fib
{
    def fib( n : Int ) : Int = { 
    var a = 1 
    var b = 2 
    var i = 1 
    println(a)
   
    
    while( i < n ) { 
      val c = a + b 
      a = b 
      b = c 
      i = i + 1 
      println(a)
   }  
   
   return a 
 }

     
    def main(args: Array[String]) {
        var nth_element = 0
        println("Fibonacci series with total " + args(0) + " elements is (starting from 1) : ")
        nth_element = fib(args(0).toInt)
        println("element " + args(0) + " in fibonacci series is : " + nth_element)
    }
 }

