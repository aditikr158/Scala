object LambdaFunction
{
    def main(args:Array[String])=
    {
        var res1=(a:Int,b:Int)=>a+b
        var res2=(_:Int)+(_:Int)
        println(res1(10,10))
        println(res2(20,20))
    }
}