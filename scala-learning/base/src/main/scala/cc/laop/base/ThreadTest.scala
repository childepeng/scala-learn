package cc.laop.base

class Thread1 extends Thread {
  override def run(): Unit = println("thread1 running.")
}

class Thread2 extends Runnable {
  override def run(): Unit = println("Thread2 running.")
}

object ThreadTest {
  def main(args: Array[String]): Unit = {
    new Thread1().start
    new Thread(new Thread2).start
    new Thread(() => println("Thread3 running.")).start
  }
}
