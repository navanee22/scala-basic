object S010_Classes extends App{
  //blueprint to create objects

  class product(val price: Double, var discount : Double){
    //class body itself is a constructor

    println("product created",price,discount)
    var total=price-(price*discount)/100.0

    override def toString: String="("+price+ ","+discount+","+total +")"
    //override def toString: String="Hai"
  }
  val p1: product =new product(price=100,discount=5)
  //type inference
  val p2=new product(price=150,discount=10)

  println("****" , p1.price, p1.discount, p1.total)
  println(p1, "**p1 checking**")
  println("***2**", p2) // calls p2.toString() to get string data

  val s = p2.toString()
  println(s)

}
