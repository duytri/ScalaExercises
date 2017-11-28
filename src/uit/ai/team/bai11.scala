package uit.ai.team

object bai11 {
  def run(): Unit = {
    var n: Int = 0
    do {
      print("Nhap vao so hang n: ")
      n = readInt()
    } while (n < 1)
    val result = solve(n)
    println("===> Tam giac Pascal co " + n + " hang la:")
    for (i <- 0 until n) {
      for (j <- 0 until n) {
        if (result(i)(j) != 0) print(result(i)(j) + "   ")
      }
      println()
    }
  }

  def solve(n: Int): Array[Array[Int]] = {
    var array = Array.ofDim[Int](n, n)
    array(0)(0) = 1
    if (n > 1) {
      array(1)(0) = 1
      array(1)(1) = 1
    }
    if (n > 2) {
      for (i <- 2 until n) array(i)(0) = 1
      for (i <- 2 until n; j <- 1 to i)
        array(i)(j) = array(i - 1)(j - 1) + array(i - 1)(j)
    }
    array
  }
}