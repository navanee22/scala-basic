

object S008_FuncSyntxContinue extends App {

  val greeting: ()=> Unit =()=>println("Good Afternoon")
  greeting()
//func takes 1 params
  val greet : String => Unit = (name)=> println("GoodAftrernoon",name)
  greet("Venkat")

  //func takes 1 params and return result

  val pow: Int=> Int=(n)=>n*n
  //func takes 2 params
  //for more than 1 params ( is mandatory

val add :(Int,Int)=> Int=(a,b)=>a+b

  println(pow(5))

  println(add(10,20))
}
