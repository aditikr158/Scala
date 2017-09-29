object WhileLoop
{
    def main(args:Array[String])
    {
        var x=1

        while(x<=10)
        {
            print(x+" ")
            x=x+2
        }
        println
        var y=1
        do
        {
            print(y+" ")
            y=y*2
        }
        while(y<=20)
    }
}