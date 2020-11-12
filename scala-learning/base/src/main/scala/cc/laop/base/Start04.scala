package cc.laop.base

/**
  * @Auther: pengpeng
  * @Date: create in 2020/11/12 17:21
  * @Description:
  */
class Ta

class Tb extends Ta

class Start04[C](c: C)


object Test {
  def main(args: Array[String]): Unit = {
    var a = new Ta
    var b = new Tb

    var c = new Start04[Ta](a)
    var d = new Start04[Ta](b)
  }

}