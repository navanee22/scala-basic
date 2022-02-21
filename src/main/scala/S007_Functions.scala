object S007_Functions extends App {
  //functions are know as first class citizen , it means functions are objects
  //functions can be passed as arguments, returns return value
  //functions are known as lambda in python and java
  //use => to define function in scala
  //methos is not function,method is not object

  //function with no parameter,return no result

  val greeting= () => println("Good Afternoon")
  greeting()

  //func takes one argument

  val greet= (name:String)=> println("Good Afternoon", name)
  greet("Venkat")

  val pow = (n: Int)=> n*n
  println(pow(5))

  //takes 2 params and returnd result
  val add=(a:Int,b:Int)=>a+b
  println(add(10,20))

  //Syntax for function declaration
  val name: String ="Venkat"


}
