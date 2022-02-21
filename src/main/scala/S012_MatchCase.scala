object S012_MatchCase extends App{

  //Scala does not support switch case instead match and case
  //other lang Switch case is a statement , it does not return output
  //in scale match and case are expresion, return output

  val result = 11 % 2== 0 match {
    case true => "Even" // return value assigned to result
    case false => "odd"

  }
  println(result)

  val result2 =(11%4)match {
    case 0=> "Zero"
    case 1=> "one"
    case _=>"unknown"
  }
  println(result2)

  //match case with if condition

  val price: Double =50.0//100.0
  val discount = price match{

    case p : Double if p >=100 =>10.0
    case p : Double if (p >= 80 && p < 100) => 5.0
    case p : Double if ( p >= 60 && p < 80) => 2.0
    case _=> 0.0
  }
  println(discount)

  val r: Int =  (if (10 < 5) 1 else 0)
  val result3 = r  match {
    case 0 => "Zero"
    case 1 => "One"
    // 2 & 3 default
    case _ => "Unknown" // default case, if 0 or 1 is not matched
  }

  println(result3)

}
