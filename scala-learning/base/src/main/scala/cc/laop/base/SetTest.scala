package cc.laop.base

import scala.collection.mutable

/**
  * @Auther: pengpeng
  * @Date: create in 2020/11/26 19:26
  * @Description:
  */
object SetTest {

  def main(args: Array[String]): Unit = {

    var s1 = Set(1, 3, "23sdf")
    var s2 = s1 ++ (1 :: 2 :: 3 :: Nil)
    println(s2)

    var s3 = mutable.Set(3, 4)
    s3.add(5)
    s3.add(23)
    println(s3)

  }

}
