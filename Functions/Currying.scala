object Currying
{
    def main(args:Array[String])
    {
        var res1= add(10)(10)
        println("res1 = "+res)

        var ans=add(10)_
        var res2=ans(5)
        println("res2 = "+ res2)
    }

    def add(a:Int)(b:Int)=
    {
        a+b
    }
}