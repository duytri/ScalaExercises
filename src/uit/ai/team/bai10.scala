package uit.ai.team

object bai10 {
  def run(): Unit = {
    var n, m: Int = 0
    var array: Array[Array[Int]] = null
    do {
      print("Nhap vao so hang cua ma tran n: ")
      n = readInt()
      print("Nhap vao so cot cua ma tran m: ")
      m = readInt()
    } while (n < 1 || m < 1)
    if (n * m < 2) println("Ma tran phai co nhieu hon 1 gia tri")
    else {
      array = Array.ofDim[Int](n, m)
      for (i <- 0 until n; j <- 0 until m) {
        print("Ban hay nhap vao gia tri cua (" + i + ", " + j + "): ")
        array(i).update(j, readInt())
      }
    }
    println("===> Gia tri lon thu hai trong ma tran la: " + solve(array))
  }

  def solve(n: Array[Array[Int]]): Int = {
    var array = n.flatMap(x => x).sortWith(_>_)
    return array.diff(Array(array.max)).head
  }
}