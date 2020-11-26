package cc.laop.base

/**
  * @Auther: pengpeng
  * @Date: create in 2020/11/17 11:39
  * @Description:
  */
object OutterTest {

  def main(args: Array[String]): Unit = {
    var o1 = new Outter
    var o2 = new Outter
    var i1 = o1.newInner()
  }

}
