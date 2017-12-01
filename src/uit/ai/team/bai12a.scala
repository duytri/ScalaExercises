package uit.ai.team

import scala.collection.mutable.ListBuffer

object bai12a {
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
    //var array: ListBuffer[List[(Int, Int)]] = new ListBuffer()
    var array: List[List[(Int, Int)]] = List()
    var result = Array.ofDim[Int](n, m)
    var count = 1

    //initial array coordinates
    for (i <- 0 until n) {
      array :+= (for (j <- 0 until m) yield (i -> j)).toList
    }

    //calculate order of coordinates of the matrix
    val indexed = calcOrderOfIndexes(array)

    //add increasing number for each coordinate
    indexed.foreach(index => {
      result(index._1)(index._2) = count
      count += 1
    })

    return result
  }

  def calcOrderOfIndexes(array: List[List[(Int, Int)]]): List[(Int, Int)] = {
    array match {
      case List() => return Nil
      case head :: tail => {
        return head ::: calcOrderOfIndexes(tail.transpose.reverse)
      }
    }
  }
}