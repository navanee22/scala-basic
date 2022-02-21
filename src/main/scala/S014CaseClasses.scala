object S014CaseClasses extends App{

  //case classes known as domain object
  //domain object, in Inventry based application



  case class Order(id: Int, amount: Double)
  case class Brand(id: Int, name: String)

  val order1= new Order(id=1, amount =100)
  //new keyword is optional for case classes
  val order2=Order(2,200)

  val b=Brand(1, "Apple")
  val b2 = Brand(1,"Samsung")

  println(order1)
  println(order2)

  println(b)
  println(b2)


}
