package cc.laop.base

/**
  * @Auther: pengpeng
  * @Date: create in 2020/11/11 16:24
  * @Description:
  */
object Start03 {

  def func(f: String => Unit) = f("Hello")

  def main(args: Array[String]): Unit = {

    func(println)

    //var str = "hello"
    //
    //print(str)
    //
    //var tup = ("Lucy", 12)
    //print(tup._1)
    //print(tup._2)
    //
    //var (name, age) = tup
    //print(name)
    //print(age)
  }


}
