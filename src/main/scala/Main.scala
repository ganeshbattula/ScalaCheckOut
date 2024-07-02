object Main {
  val applePrice = 0.60
  val orangePrice = 0.25

  def calculateTotal(items: List[String]): Double = {
    val appleCount = items.count(_ == "Apple")
    val orangeCount = items.count(_ == "Orange")

    val total = (appleCount * applePrice) + (orangeCount * orangePrice)
    BigDecimal(total).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def main(args: Array[String]): Unit = {
    val items = List("Apple", "Apple", "Orange", "Apple")
    val total = calculateTotal(items)
    println(s"Total cost: £$total")
  }
}
