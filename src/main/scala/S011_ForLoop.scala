object S011_ForLoop extends App{

  val r1= 1 to 10
  println(r1.toList)
  val r2=1 until 10
  println(r2.toList)

  for(i<- 1 to 5)
    print(i)

  println()

  //Multiline forloop

  for(i<-11 to 15 ){

    print(i)
  }
  println()

  for{i<- 21 to 25}println(i)

  for{i<- 26 to 30} {
    println(i)
  }

  //forloop with if condition
  //print only odd numbers
  for{i<-31 to 40 if i%2 ==1}
    println(i)

  //nested for loop
  for {i <- 41 to 45
       j<- 46 to 50
       }println(i,j)


  for{i<- Seq("a","b","c")
      j<-1 to 3
      }println(i,j)
}
