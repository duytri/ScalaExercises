package uit.ai.team

object bai5 {
  def run(): Unit = {
    var n: Int = 0
    do {
      print("Nhap vao so tien n (chia het cho 1000): ")
      n = readInt()
    } while (n % 1000 != 0)
    println("===> Cac ket qua co the la:")
    val result = solve(n)
    result.foreach(item => {
      println(item._1 + " to 5000d, " + item._2 + " to 3000d va " + item._3 + " to 1000d")
    })
  }

  def solve(n: Int): Seq[(Int, Int, Int)] = {
    return (0 to n / 5000).flatMap(x => {
      (0 to (n - 5000 * x) / 3000).map(y => {
        (x, y, (n - 5000 * x - 3000 * y) / 1000)
      })
    })
  }
}