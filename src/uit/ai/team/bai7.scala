package uit.ai.team

object bai7 {
  def run(): Unit = {
    var n: String = ""
    do {
      print("Nhap vao mang so nguyen (cach nhau bang khoang trang): ")
      n = readLine()
    } while (n.length() == 0)
    println("===> Ket qua la: " + solve(n))
  }

  def solve(n: String): String = {
    val input = n.split(" ").map(_.toInt)
    val even = input.filter(_%2==0).sortWith(_<_)
    val odd = input.filter(_%2!=0).sortWith(_>_)
    (even++odd).mkString(" ")
  }
}