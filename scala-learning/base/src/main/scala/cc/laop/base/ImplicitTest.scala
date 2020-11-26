package cc.laop.base

/**
  * @Auther: pengpeng
  * @Date: create in 2020/11/17 16:20
  * @Description:
  */
class Test01[A] {
  def prt(implicit a: A): Unit = println("prt " + a)

  def prt2(s: String): Unit = println("prt2 " + s)
}

class Test02[A] {
  def prt3(a: A): Unit = println("prt3 " + a)
}

object ImplicitTest {

  implicit def int2String(i: Int): String = i.toString

  implicit def test01To02(t: Test01[String]): Test02[String] = new Test02[String]

  def main(args: Array[String]): Unit = {
    implicit var b: String = "Hello"

    var t1 = new Test01[String]
    t1.prt
    t1.prt2("ser")
    t1.prt2(123)

    t1.prt3("dfr")
  }
}
