package uit.ai.team

object ScalaExercises {
  def main(args: Array[String]): Unit = {
    var i = 0
    do {
      printHelp()
      print("*** Lua chon: ")
      i = readInt()
      i match {
        case 1 => bai1.run()
        case 2 => bai2.run()
        case 3 => bai3.run()
        case 4 => bai4.run()
      }
    } while (i < 0 || i > 12)
  }

  def printHelp(): Unit = {
    println("[ScalaExercises] NHUNG BAI TAP VI DU VOI NGON NGU SCALA")
    println("Hay chon bai tap trong danh sach ben duoi")
    println("1. Tong cac thuong, S(n).")
    println("2. Tong cac can bac 2, S(n)")
    println("3. Hay tinh tich cac chu so le cua so nguyen duong n.")
    println("4. Viet chuong trinh in ban cuu chuong ra man hinh.")
    println("5. Can co tong n nghin dong tu 3 loai giay bac mot nghin dong, hai nghin dong va nam nghin dong. Lap chuong trinh de tim tat ca cac phuong an co the.")
    println("6. Cho mang mot chieu cac so thuc,hay tim doan [a,b] sao cho doan nay chua tat ca cac gia tri trong mang.")
    println("7. Sap xep cac so chan tang dan,cac so le giam dan trong mang mot chieu cac so nguyen.")
    println("8. Hay liet ke cac gia tri co so lan xuat hien nhieu nhat trong mang cac so nguyen.")
    println("9. Hay sap xep cac so nguyen to trong mang cac so nguyen tang dan,cac gia tri khac giu nguyen gia tri va vi tri.")
    println("10. Tim gia tri lon thu nhi trong ma tran. Gia su ma tran co nhieu hon hai gia tri.")
    println("11. Viet chuong trinh in ra tam giac Pascal co n hang.")
    println("12. Viet chuong trinh in ra mot ma tran cac so nguyen tang dan theo hinh xoan oc co n hang * m cot.")

  }
}