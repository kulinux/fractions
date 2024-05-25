import Number._

class MySuite extends munit.FunSuite {
  test("1/1 + 1/1 be 2") {
    val sum1 = 1 div 1
    assertEquals(sum1 `sum` sum1, 2 div 1)
  }

  test("2/1 should be 2") {
    assertEquals(2 div 1, Entire(2))
  }

  test("1/2 + 1/2 be 2/2") {
    val sum1 = 1 div 2
    assertEquals(sum1 `sum` sum1, Entire(1))
  }

  test("1/3 + 1/2 be 5/6") {
    val sum1 = 1 div 3
    val sum2 = 1 div 2
    val expected = 5 div 6
    assertEquals(sum1 `sum` sum2, expected)
  }

  test("1/2 + 1 be 3/2") {
    val sum1 = 1 div 2
    val sum2 = Entire(1)
    assertEquals(sum1 `sum` sum2, 3 div 2)
  }

  test("1 + 1/2 be 3/2") {
    val sum1 = Entire(1)
    val sum2 = 1 div 2
    assertEquals(sum1 `sum` sum2, 3 div 2)
  }
}
