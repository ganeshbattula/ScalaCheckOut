import org.scalatest.funsuite.AnyFunSuite

class CheckoutTest extends AnyFunSuite {
  test("Calculate total without offers") {
    assert(Main.calculateTotal(List("Apple", "Apple", "Orange")) == 1.45)
    assert(Main.calculateTotal(List("Apple", "Orange", "Orange", "Orange")) == 1.35)
    assert(Main.calculateTotal(List("Apple", "Apple", "Apple", "Orange", "Orange")) == 2.30)
  }

  test("Calculate total with offers") {
    assert(Main.calculateTotalWithOffers(List("Apple", "Apple", "Orange", "Apple", "Orange", "Orange", "Orange")) == 1.95)
    assert(Main.calculateTotalWithOffers(List("Apple", "Apple", "Apple", "Apple")) == 1.20)
    assert(Main.calculateTotalWithOffers(List("Orange", "Orange", "Orange", "Orange")) == 0.75)
    assert(Main.calculateTotalWithOffers(List("Apple", "Orange")) == 0.85)
  }
}
