object exercise001 {
  private def fib(n: Int): Int = {
    @scala.annotation.tailrec
    def fibInner(n: Int, a: Int, b: Int): Int = {
      if (n == 1) a
      else if (n == 2) b
      else fibInner(n - 1, b, a + b)
    }

    println("Calculate for n = " + n)
    fibInner(n, 0, 1)
  }

  private def fibSimple(n: Int, acc: Int) = {
    if (n == 1) 0
    else if (n == 2) 1
    else fib(n - 1) + fib(n - 2)   
  }

  def main(args: Array[String]) {
    val n = args(0).toInt
    println(fib(n))
  }
}
