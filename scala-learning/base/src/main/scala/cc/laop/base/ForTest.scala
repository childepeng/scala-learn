package cc.laop.base

object ForTest {

  def main(args: Array[String]): Unit = {

    var list = Seq("a", "b", "c")

    list.foreach(println(_))

    for(v <- list){
      println(v)
    }

    var l1 = Range(0, 10).toSeq
    l1.foreach(println(_))

    var l2 = (0 to 10).toSeq
    l2.foreach(println(_))
  }
}
