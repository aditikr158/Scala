object VariableArgument
{
    def main(args:Array[String])
    {
        printStrings("Apple", "Orange", "Grapes")
    }

    def printStrings(args: String*)
    {
        var i:Int=0
        for(arg <-args)
        {
            println("Arg value[" +i +"]= "+ arg )
            i=i+1
        }
    }
}