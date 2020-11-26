package cc.laop.base

import scala.collection.mutable.Seq

/**
  * @Auther: pengpeng
  * @Date: create in 2020/11/26 18:38
  * @Description:
  */
object SeqTest {

  def main(args: Array[String]): Unit = {

    var l1 = 1 :: 2 :: 3 :: Nil
    println(l1)

    var l2 = List(1, "2abcdh", 3)
    println(l2)

    var l3 = l1 ++ l2
    println(l3)

    println(l3.head)

    var l4 = l3.drop(2)
    println(l4)

    var l5 = l3.+:(123)
    println(l5)

  }

}
