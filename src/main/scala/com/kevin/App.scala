package com.kevin

/**
 * @author ${user.name}
 */
object App {

  import java.util.Calendar

  def foo(x : Array[String]) = x.foldRight("2")((a,b) => a + b)

  def isFridayThirteen(cal: Calendar): Boolean = {
    val dayOfWeek = cal.get(Calendar.DAY_OF_WEEK)
    val dayOfMonth = cal.get(Calendar.DAY_OF_MONTH)

    (dayOfWeek == Calendar.FRIDAY) && (dayOfMonth == 13)
  }
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(Array("3", "——5")))

    val dogBreeds = List("Doberman", "Yorkshire Terrier")
    for {breed <- dogBreeds if breed.contains("man")} println(breed)

    for {
      breed <- dogBreeds
      if breed.contains("man")
    } yield breed

    val dogOptions = List(Some("a"), None, Some("b"), None)
    for {
      breedOption <- dogOptions if breedOption != None
      breed <- breedOption
      upcaseBread <- breed.toUpperCase
    } println(upcaseBread)

    for {
      Some(breed) <- dogOptions
      upcaseBread <- breed.toUpperCase
    } println(upcaseBread)



  }

}
