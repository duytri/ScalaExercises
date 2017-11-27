package uit.ai.team

object bai4 {
  def run(): Unit = {
    println("Chuong trinh in ra man hinh Bang cuu chuong")
    for(i <- 1 to 9){
      for(j <- 1 to 9){
        print(j+" x "+i+" = "+i*j+"\t")
      }
      println()
    }
  }
}