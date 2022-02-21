object S015ClassInheritance extends App{

  //Shape - Abstraction
  //Some properties are common
  //color
  //area
  //Square is a shape - concrete class
  //Rectangle is a shape - concrete class

  //Animal - Abstraction
  //color,weight...
  //Lion is an Animal - concrete class
  //Cow is an Animal - concrete class

  //We cannot create object for abstract class

abstract class Shape(val color : String){

  def area(): Double = ???
  def getcolor(): String = color

  }
  class Square (val side: Double, c: String) extends Shape (c){

   override def area(): Double = side * side

    def setcolor(): Double = side
  }
class Rectangle (val width: Double, val length : Double, c: String)extends Shape(c){

  override def area(): Double = width * length

  def getWidth(): Double = width
  def getlength() = length
}

  val s1 = new Square(4, "red")
  println(s1.getcolor())
 // println(s1.getside())
  println(s1.area())

  val r1 = new Rectangle(6,4,"green")
  println(r1.getcolor())
  println(r1.getlength(),r1.getWidth())
  println(r1.area())

}
