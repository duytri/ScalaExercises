package uit.ai.team

import scala.collection.mutable.Map

object bai8 {
  def run(): Unit = {
    var n: String = ""
    do {
      print("Nhap vao mang so nguyen (cach nhau bang khoang trang): ")
      n = readLine()
    } while (n.length() == 0)
    val result = solve(n)
    println("===> Ket qua la: ")
    result.foreach(x => println("So " + x._1 + " co so lan xuat hien la: " + x._2))
  }

  def solve(n: String): Map[Int, Int] = {
    val input = n.split(" ").map(_.toInt)
    var output: Map[Int, Int] = Map()
    input.foreach(x => {
      if (!output.contains(x))
        output += (x -> 1)
      else
        output(x) = output(x) + 1
      //output.update(x, output.get(x).get + 1)
    })
    return output.filter(x => (x._2 == output.values.max))
  }
}