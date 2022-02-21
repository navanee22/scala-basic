object S019_Tuple extends App {

  //Tuple is immutable collection

  val stock = ("INFY", 1600.0, 1580.3, 1620.5, 1000000)
  println(stock._1) // INFY
  println(stock._4)
  println(stock._5)

  val x = ("IN", "India")
  println(x._1, x._2)

  //Tuple only works for two elements pair
  // generally used for key value pair in map dictionary

  val pair2 = "IN" -> "India"
  println(pair2._1, pair2._2)
}
