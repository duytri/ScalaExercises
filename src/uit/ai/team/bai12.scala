package uit.ai.team

object bai12 {
  def run(): Unit = {
    var n, m: Int = 0
    do {
      print("Nhap vao so hang cua ma tran n: ")
      n = readInt()
      print("Nhap vao so cot cua ma tran m: ")
      m = readInt()
    } while (n < 1 || m < 1)
    val result = solve(n, m)
    println("==> Ket qua la: ")
    result.foreach(row => {
      row.foreach(col => {
        print(col + "\t")
      })
      println()
    })
  }

  def solve(n: Int, m: Int): Array[Array[Int]] = {
    var array = Array.ofDim[Int](n, m)
    var count = 1
    var iDau = 0; var iCuoi = n - 1; var jDau = 0; var jCuoi = m - 1
    while (iCuoi >= iDau && jCuoi >= jDau) {
      // Turn 1
      for (j <- jDau to jCuoi - 1) {
        array(iDau)(j) = count
        count += 1
      }
      //Turn 2
      for (i <- iDau to iCuoi - 1) {
        array(i)(jCuoi) = count
        count += 1
      }
      // Turn 3
      for (j <- jCuoi to jDau + 1 by -1) {
        array(iCuoi)(j) = count
        count += 1
      }
      //Turn 4
      for (i <- iCuoi to iDau + 1 by -1) {
        array(i)(jDau) = count
        count += 1
      }
      iDau += 1; iCuoi -= 1; jDau += 1; jCuoi -= 1
    }
    if((n%2==1) && (m%2==1))
    	array((n-1)/2)((m-1)/2) = n*m
    return array
  }
}
