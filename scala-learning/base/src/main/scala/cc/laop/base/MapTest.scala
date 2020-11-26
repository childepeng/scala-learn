package cc.laop.base

import scala.collection.mutable


/**
  * @Auther: pengpeng
  * @Date: create in 2020/11/26 19:40
  * @Description:
  */
object MapTest {

  def main(args: Array[String]): Unit = {

    var m1 = mutable.Map("a" -> 1, "b" -> 4)
    println(m1.get("a").get)

  }

}
