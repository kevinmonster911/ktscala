package com.kevin

/**
  * Created by kevinmonster on 16/12/16.
  */
object TryCatch {

  def main(args: Array[String]) = {
    Array("/Users/kevinmonster/workspace/ktscala/src/main/resources/read.txt") foreach(arg => countLines(arg))
  }

  import scala.io.Source
  import scala.util.control.NonFatal

  def countLines(fileName: String) = {

    println()
    var source:Option[Source] = None
    try {
      source = Some(Source.fromFile(fileName))
      val size = source.get.getLines.size
      println(s"file $fileName has $size lines")
    } catch {
      case NonFatal(ex) => println(s"Non fatal exception! $ex")
    } finally {
      for(s <- source) {
        println(s"Closing $fileName...")
        s.close
      }
    }
  }
}
