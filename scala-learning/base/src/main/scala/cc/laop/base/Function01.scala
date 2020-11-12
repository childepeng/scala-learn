package cc.laop.base

/**
  * @Auther: pengpeng
  * @Date: create in 2020/11/11 18:35
  * @Description:
  */
object Function01 {

  def main(args: Array[String]): Unit = {
    // 匿名函数fun
    var fun = (x: Int) => x + 1
    println(fun)

    // compute是内嵌方法，接口两个参数：函数 和 一个Int
    def compute(fun: (Int) => Int, y: Int): Int = fun(y)

    println(compute(fun, 3))

    // 返回函数
    def add(y: Int): (Int) => Int = {
      return (x: Int) => x + y
    }
    println(add(3)(2))

    var tup = (1)
    println(tup)

    var tup2 = (1, 2)
    println(tup2._2)

  }

}
