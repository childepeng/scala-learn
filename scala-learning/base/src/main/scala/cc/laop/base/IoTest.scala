package cc.laop.base

import scala.io.Source


/**
  * @Auther: pengpeng
  * @Date: create in 2020/12/1 16:13
  * @Description:
  */
object IoTest {

  def main(args: Array[String]): Unit = {

    println("hello")

    //    var b = StdIn.readChar()
    //    println(b)

    //    var bl = StdIn.readBoolean()
    //    println(bl)

    println(Source
      .fromFile("C:\\Users\\Administrator\\Desktop\\Application.md")
      .mkString)
    //      .getLines()
    //      .foreach(println(_))

    //    Source.fromString("Hello World").foreach(println(_))


    //    Source.fromURL("https://github.com/scala-learn/raw/main/README.md", "UTF-8")
    //      .getLines()
    //      .foreach(println(_))

    var s = "sef"
    s.synchronized()
    s.notify()
  }

  def func: Unit = synchronized() {

  }
}
