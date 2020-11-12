package cc.laop.base

/**
  * @Auther: pengpeng
  * @Date: create in 2020/11/11 15:16
  * @Description:
  */
trait Interator[A] {
  def hasNext: Boolean

  def next: A
}


class List extends Interator[String] {
  private var curr: Int = 0
  private var list: Array[String] = new Array[String](10)

  override def hasNext: Boolean = {
    if (curr < list.length - 1) {
      return false
    }
    return true
  }

  override def next: String = {
    var n = list(curr)
    curr += 1
    return n
  }
}


trait A

trait B

abstract class C

class D extends C with A with B







