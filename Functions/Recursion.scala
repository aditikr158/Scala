object Recursion
{
    def main(args:Array[String])
    {
        for(i<- 1 to 5)
            println("Factorial of "+i+" = "+fact(i))
    }

    def fact(n:BigInt):BigInt =
    {
        if(n<=1)
            1
        else
            n*fact(n-1)
    }
}