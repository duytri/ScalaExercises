package uit.ai.team

object bai9 {
  def run(): Unit = {
    var n: String = ""
    do {
      print("Nhap vao mang so nguyen (cach nhau bang khoang trang): ")
      n = readLine()
    } while (n.length() == 0)
    val result = solve(n).mkString(" ")
    println("===> Mang sau khi sap xep cac so nguyen to tang dan: \n" + result)
  }

  def solve(n: String): Array[Int] = {
    var input = n.split(" ").map(_.toInt)
    var primes: List[Int] = List()
    var position: List[Int] = List()
    for (i <- 0 until input.length) {
      if (isPrime(input(i))) {
        primes ::= input(i)
        position ::= i
      }
    }
    primes = primes.sortWith(_ > _)
    for (i <- 0 until position.length) {
      input(position(i)) = primes(i)
    }
    input
  }

  def isPrime(n: Int): Boolean = {
    if (n == 1) false
    else if (n == 2) true
    else
      !(2 +: (3 to Math.sqrt(n).toInt by 2) exists (n % _ == 0))
  }
}