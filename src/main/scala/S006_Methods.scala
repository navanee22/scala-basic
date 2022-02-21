object S006_Methods extends App{
  //resuable code, functions
  //a meyhod that doesnt take any parameter,does not return output

  def greeting(): Unit = println("Good Morning")
  greeting()
  greeting()

  //method takes 1 parameter
  def greet(msg: String): Unit = println("Good Morning",msg)

  greet(msg= "Venkat")
  greet(msg= "joe")

  //method that takes one parameter and return result
  def pow(n :Int): Int= n*n

  println( pow(5))

  def add(a:Int, b: Int): Int= a+b
  println(add(20,30))

  //keyword argument

  println( add(b=100,a=20))

  //default values for parameters

  def sum(a : Int=0,b: Int=0): Int= a+b
  println(sum())
  println(sum(10))
  println(sum(10,20))
  println(sum(b=20))

  //variable no of argument
  def printNames(names: String*): Unit = names.foreach(println)

  printNames() //not passing any arguments
  printNames(names="Scala")
  printNames(names="Scala", "python")
  printNames(names= "Scala", "python", "kafka")

  //multiline code using{} block

  def sub(a: Int, b: Int): Int ={
    println("A is", a,"B is", b)
    a-b
  }

  println(sub(20,10))//10
  println(sub(10,20))//-10
}
