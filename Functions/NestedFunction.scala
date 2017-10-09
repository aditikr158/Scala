object NestedFunction
{
    def main(args:Array[String])
    {
        println("0! = "+factorial(0))
        println("1! = "+factorial(1))
        println("5! = "+factorial(5))
        println("10! = "+factorial(10))
    }

    def factorial(i:Int): Int=
    {
        def fact(i:Int, acc:Int):Int=
        {
            if(i<=1)
                acc
            else
                fact(i-1,i*acc)
        }
        fact(i,1)
    }
}