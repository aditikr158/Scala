object NamedArguments
{
    def main(args:Array[String])
    {
        display(b=5,a=7)
    }

    def display(a:Int, b:Int) =
    {
        println("a = "+a)
        println("b = "+b)
    }
}