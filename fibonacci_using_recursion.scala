object fib
{
    def fib( n : Int) : Int = n match {
        case 1 | 2 => n
        case _ => fib(n-1) + fib(n-2)
        }
     
    def main(args: Array[String]) {
        println("Element " + args(0) + " in fibonacci series is (starting from 1): " + fib(args(0).toInt))
    }
 }

