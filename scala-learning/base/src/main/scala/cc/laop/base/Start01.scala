package cc.laop.base

/**
  * @Auther: pengpeng
  * @Date: create in 2020/11/10 17:14
  * @Description:
  */
object Start01 {

  def main(args: Array[String]): Unit = {

    var s1 = "123"
    // s1 = 123  // 变量类型不可修改，编译报错

    val s2 = "s2"
    // s2 = "d3"  // val 变量不可修改，编译会报错

    var s3:String = "s3"  // 通过 " :Class " 显示声明变量类型

    lazy val s4 = "s4"

  }

}
