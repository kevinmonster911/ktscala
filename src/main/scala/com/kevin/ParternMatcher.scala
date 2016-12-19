package com.kevin

/**
  * Created by kevinmonster on 16/12/19.
  */
object ParternMatcher {

  def main(args: Array[String]): Unit = {

    case class Address(street: String, city: String, country: String)
    case class Person(name: String, age: Int)

    val as = Seq(
      Address("1 scala lane", "anytown", "USA")
    )

    val ps = Seq(
      Person("Buck Trends", 29)
    )

    val pas = ps zip as

    println(pas)

    val result1 = pas map { tup =>
      val Person(name, age) = tup._1
      val Address(street, city, country) = tup._2
      s"$name (age: $age) lives at $street, $city, in $country"
    }

    println(result1)

    pas map {
      case (Person(name, age), Address(street, city, country)) =>
        s"$name (age: $age) lives at $street, $city, in $country"
    }
  }
}
