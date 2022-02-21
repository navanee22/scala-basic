object S002_Var extends App{
  //variable-value can be changed
  var k: Int=10
  println(k)
  k=20
  println(k)

  k+=1
  println(k)
  k=k+1
  println(k)

  ///type inferance
  //name is string type
  var name="Scala"
  println(name)
//to find the data type we can use getclass function
  println(name.getClass())
}
