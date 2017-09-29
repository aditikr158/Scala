object LoopForList
{
    def main(args:Array[String])
    {
        var list : List[Int] = List(1,2,3,4,5)
        forLoop(list)
        forEachLoop(list)
    }

    def forLoop(list : List[Int])
    {
        print("For Loop for Iterating Collection : " )
        for(i<-list)
        {
            print(i+" ")
        }

        println
    }

    def forEachLoop(list:List[Int])
    {
        println("For Each Loop for Iterating Collection")
        //Method 1
        println("Method 1 : ")
        list.foreach
        {
            println
        }

        //Method 2
        print("Method 2 : ")
        list.foreach(print)
        
        println(" ")

        //Method 3
        print("Method 3 : ")
        list.foreach((element : Int)=> print(element+" "))  //explicitly mentioning type of element
    
    }
}