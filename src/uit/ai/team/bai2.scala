package uit.ai.team

object bai2 {
  def run(): Unit = {
    var n: Int = 0
    do {
      print("Nhap vao so n: ")
      n = readInt()
    } while (n < 1)
    println("===> Ket qua la: " + solve(n))
  }
  
  def solve(n: Int): Double = {
    return (1 to n).foldLeft(0d)((sum, x) => {
      Math.sqrt(sum + x)
    })
  }
}