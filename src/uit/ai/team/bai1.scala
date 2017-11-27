package uit.ai.team

object bai1 {
  def run(): Unit = {
    var n: Int = 0
    do {
      print("Nhap vao so n: ")
      n = readInt()
    } while (n < 1)
    println("===> Ket qua la: " + solve(n))
  }
  
  def solve(n: Int): Double = {
    var sum: Double = 1d
    return (2 to n).foldLeft(1d)((y, x) => {
      sum += x
      y + 1 / sum
    })
  }
}