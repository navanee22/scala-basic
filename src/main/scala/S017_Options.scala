object S017_Options extends App{

  //Scala = handling errors and exceptions

  def toInt(s:String) : Option [Int] = {

    //convert String ti Int and return Int

    try {
     Some( s.toInt) // Some Int value

    } catch {
      case _ => None

    }

  }
  val n : Option[Int] = toInt("100")

  println(n)
  if (n.isDefined){

    println("We got thr result", n.get)
  }

  val m : Option[Int] = toInt("INF+")
  println(m)
  if(m.isEmpty){

    println("Sorry , m is empty")}

  println("Done")

  //for loop, for comprehension can be used with Option

  for{ value <- toInt("200")}
    println("value is ", value)

  //toInt return none, for comprehension will not print any value
  for{ value <- toInt("-INF")}
    println("value is ", value)

}
