object Main {
  val applePrice = 0.60
  val orangePrice = 0.25

  def calculateTotal(items: List[String]): Double = {
    val appleCount = items.count(_ == "Apple")
    val orangeCount = items.count(_ == "Orange")

    val total = (appleCount * applePrice) + (orangeCount * orangePrice)
    BigDecimal(total).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def calculateTotalWithOffers(items: List[String]): Double = {
    val appleCount = items.count(_ == "Apple")
    val orangeCount = items.count(_ == "Orange")

    val appleCost = ((appleCount / 2) + (appleCount % 2)) * applePrice
    val orangeCost = ((orangeCount / 3) * 2 + (orangeCount % 3)) * orangePrice

    val total = appleCost + orangeCost
    BigDecimal(total).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def main(args: Array[String]): Unit = {
    val items = List("Apple", "Apple", "Orange", "Apple", "Orange", "Orange", "Orange")
    val total = calculateTotalWithOffers(items)
    println(s"Total cost with offers: £$total")
  }
}
