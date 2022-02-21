object S010_Map extends App{

  //Map is similar to dict in python

  val countryCode = Map[String, String] (
    "IN" -> "India" ,
    "USA" -> "United States of America",
   ("CA" , "Canada") )

    println(countryCode("USA"))
    println( countryCode.contains("CA"))
    println (countryCode.keys)



}
