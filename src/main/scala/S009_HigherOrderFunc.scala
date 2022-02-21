object S009_HigherOrderFunc extends App{
  //fuc that takes another func as parametr

  val square=(n:Int)=> n*n
  val square1:(Int)=>Int = n => n*n
  val cube: (Int)=> Int = n => n*n*n

  //higher order func
  // higher order function, that accept function as parameter
  // inference
  // sum functions  takes two parameter, return 1 ouput
  // first parameter f is function, that accept Int as parameter, return Int
  // n is int
  // calling f(x) means we call square or cube that passed as argument

  val higherOrderFunc =(f: Int=>Int,n : Int)=>f(n)

  println(higherOrderFunc(square,5))
  println(higherOrderFunc(cube,5))

  //n shall be 3
  println(higherOrderFunc(n=>n*n,3))

  // sum of sq/cube/sqrt/anything of numbers

  val sum: (Double => Double,Double*)=> Double =(f, numbers)=> {
    var s : Double = 0.0
    //for each numbers
    for (n <- numbers) {
      s= s + f(n)
      s //return value
    }
    s //return value
  }

  // IntellijSense from IntelliJ Authors
  // 1 ^2 + 2 ^ 2 + 3^2 = 14
    val result1=sum(n=> n * n, 1.0,2.0 )
println(result1)

  ///val z= def fn(x:Int,y:Int):Int=x+y


}
