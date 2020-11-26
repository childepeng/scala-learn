package cc.laop.base

/**
  * @Auther: pengpeng
  * @Date: create in 2020/11/17 11:30
  * @Description:
  */
class Outter {

  self =>

  class Inner{}

  def func(i: Inner): Unit = print(i)

  def newInner(): Inner = new Inner
}

object Outter {
  def main(args: Array[String]): Unit = {
    var o1 = new Outter
    var o2 = new Outter
    var i1 = o1.newInner()
    var i2 = o2.newInner()
  }
}
