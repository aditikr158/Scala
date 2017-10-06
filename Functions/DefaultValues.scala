object DefaultValues
{
    def main(args: Array[String])
    {
        println("Returned Value: "+ add(2,3))
        println("Returned Value: "+ add(2))
        println("Returned Value: "+ add())
    }

    def add(a:Int=5, b:Int=5) : Int=
    {
        a+b
    }
}