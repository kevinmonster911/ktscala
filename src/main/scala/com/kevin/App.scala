package com.kevin

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldRight("2")((a,b) => a + b)
  
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
