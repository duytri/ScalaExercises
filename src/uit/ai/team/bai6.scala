package uit.ai.team

object bai6 {
  def run(): Unit = {
    var n: String = ""
    do {
      print("Nhap vao mang so thuc (cach nhau bang khoang trang): ")
      n = readLine()
    } while (n.length() == 0)
    val result = solve(n)
    println("===> Ket qua la: [" + result._1 + ", " + result._2 + "]")
  }

  def solve(n: String): (Int, Int) = {
    val input = n.split(" ").map(_.toDouble).sortWith(_ > _)
    val upperBound: Int = if (input.head.toInt < input.head) input.head.toInt + 1 else input.head.toInt
    val lowerBound: Int = if (input.last.toInt > input.last) input.last.toInt - 1 else input.last.toInt
    (lowerBound, upperBound)
  }
}