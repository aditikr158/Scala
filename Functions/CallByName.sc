object CallByName
{
    def main(args:Array[String])
    {
        //Example 1
        multiply(add())
        //Example 2
        delayed(time())
    }

    def add() =
    {
        println("In add function")
        2+3
    }

    def multiply(x : => Int) =
    {
        println("Multiplication")
        println("x*2 : "+ x*2)
    }

    def time() =
    {
        println("Getting time")
        System.nanoTime
    }

    def delayed(t : => Long) =
    {
        println("In delayed method")
        println("Param :"+t)
    }
}
