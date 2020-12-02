package cc.laop.base

import scala.collection.immutable.HashMap

/**
  * @Auther: pengpeng
  * @Date: create in 2020/12/2 17:55
  * @Description:
  */
object YieldTest {

  //  def dofor(list: Array[Int]): Unit = {
  //    for (elem <- list)
  //      yield {
  //        println(elem)
  //        elem
  //      }
  //  }

  def main(args: Array[String]): Unit = {

    //    var arr = Array(1, 2, 3, 4, 5)
    //
    //    var g =
    //      for (arr <- arr) yield {
    //        println(arr)
    //        arr * 2
    //      }
    //
    //    println("--------")
    //    for (elem <- g) {
    //      println(elem)
    //    }

    var map = HashMap("a" -> 1, "b" -> 2)
    var g1 = for (elem <- map) yield elem._2 * 2
    g1.foreach(println(_))
  }

}
