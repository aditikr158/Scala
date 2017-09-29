object ForLoop
{
    def using_To_Keyword
    {
        var i=1
        print("Using To Keyword : ")
        for(i<-1 to 10)
        {
            print(i+" ")
        }
        println
    }

    def using_Until_Keyword
    {
        var j=1
        print("Using Until Keyword : ")
        for(j<- 1 until 10)
        {
            print(j+" ")
        }
        println
    }

    def using_By_Keyword
    {
        var k=1
        print("Using By Keyword : ")
        for(k<-1 to 10 by 2)
        {
            print(k+" ")
        }
        println
    }

    def using_Yield_Keyword
    {
        var z=1
        print("Using Yield Keyword : ")
        var ans=for(z<-1 to 10) yield z
        for(y<-ans)
        {
            print(y+" ")
        }
        println 
    }

    def loop_Filtering
    {
        var x=1
        print("Loop Filtering : ")
        for(x<-1 to 10 if x%2==0)
        {
            print(x+" ")
        }
        println
    }

    def main(args:Array[String])
    {
        using_To_Keyword
        using_Until_Keyword
        using_By_Keyword
        using_Yield_Keyword
        loop_Filtering
    }
}