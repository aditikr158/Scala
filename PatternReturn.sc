object PatternReturn
{
    def main(args:Array[String])
    {
        var ans=search("Hello")
        println (ans)
    }

    def search(a:Any):Any = a match
    {
        case 1 => println("One")
        case "Two" => println("Two")
        case "Hello" => println("Hello")
        case _ => println("Invalid Match")
    }
}