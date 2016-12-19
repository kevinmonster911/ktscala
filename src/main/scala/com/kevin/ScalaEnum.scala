package com.kevin

/**
  * Created by kevinmonster on 16/12/17.
  */
object ScalaEnum {

  class Animal(name: String, category: String)

  class Cat(name:String) extends Animal(name, null);

  def main(args: Array[String]) = {
    object WeekDay extends Enumeration{
      type WeekDay = Value
      val Mon, Tue, Wed = Value
    }
    import WeekDay._
    WeekDay.values foreach println

    for {
      x <- Seq(1,2,2.7, "one", "two", 'four)
    } {
      val str = x match {
        case 1      => "int 1"
        case i: Int => "other int:" + i
        case "one" => "string one"
        case s: String => "other string:" +s
        case unexpected => "unexpected"
      }
      println(str)
    }

  }

}
