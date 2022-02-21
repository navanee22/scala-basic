object S013Objects extends App{

  //objrct in Scal is know as singleton instances
  //Singleton means only 1 object at any point of time
  //Similar to Java Static
  //main function for Scala application , We can use Object

  object Logger{
    def info(msg:String): Unit = println("INFO" + msg)
    def error(msg:String): Unit = println("ERROR "+ msg)

  }
Logger.info(msg = "Starting Application")
  Logger.error(msg="Could not connect to DB")

  object Memory {
    var cache : String =""
    def setCache(v: String): Unit =cache=v
    def getCache(): String = cache
    var pow = (n:Int) => n*n
  }

  Memory.setCache("1 + 2 = 3")

  println ("**calling get cache method****", Memory.getCache())

  class Sample {
    Logger.info("Creating Sample object")
  }

  val s = new Sample()

  println(Memory.pow(10))

}
