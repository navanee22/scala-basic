import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments

object S016_FuncN extends App{

  //FunctionN, N represents number of params to Function

  //Scala Function ,we used =>,=> that represents Function is known as syntactic sugar

  //Scala converts all => into FunctionN while compilng

  //FunctionN, 0 - no arguments
 // 1 - 1 Arguments
  //..22 - 22 args

val pow = (n: Int)=> n*n

  println( pow(5))//25 we do this..called syntactic sugar
  println(pow.apply(5))//25 calls same function Scala does this


  val power:  Function1[Int, Int] = new Function1[Int, Int] {
    def apply(n: Int): Int = n * n

    println(power(5))

    println (power.apply(5))

  val add: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
    def apply(a: Int, b: Int): Int = a+b
  }

    println( add(10,20))
    println(add.apply(10,20))


}
}
