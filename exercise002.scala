object exercise002 {
  private def isSorted[A](array: Array[A], comp: (A, A) => Boolean): Boolean = {
    def loop(n: Int): Boolean = {
      if (n >= array.length) true
      else if (comp(array(n - 1), array(n))) loop(n + 1)
      else false
    }

    loop(1)
  }

  def main(args: Array[String]) = {
    def compare(a: Int, b: Int): Boolean = a < b

    val numbers = args.map( s => s.toInt )
    println(isSorted[Int](numbers, compare))
  }
}
