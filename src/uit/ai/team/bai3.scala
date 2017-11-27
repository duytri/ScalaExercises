package uit.ai.team

object bai3 {
  def run(): Unit = {
    var n: Int = 0
    do {
      print("Nhap vao so n: ")
      n = readInt()
    } while (n < 0)
    println("===> Ket qua la: " + solve(n))
  }

  def solve(n: Int): Int = {
    val sepInt: List[Int] = n.toString().toList.map(_ - '0')
    return sepInt.foldLeft(1)((multi, i) => {
      if (i % 2 != 0)
        multi * i
      else multi
    })
  }
}