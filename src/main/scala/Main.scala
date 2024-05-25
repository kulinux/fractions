import Number.entire
enum Number:
  case Entire(n: Int)
  case Div(num: Int, den: Int)

  def toDiv(): Div =
    this match
      case Entire(n) => Div(n, 1)
      case div: Div  => div

  def sum(other: Number): Number =
    val one = this.toDiv()
    val two = other.toDiv()
    Div(one.num * two.den + two.num * one.den, one.den * two.den)

  override def equals(other: Any): Boolean =
    this match
      case Entire(n1) =>
        other match
          case Entire(n2)      => n1 == n2
          case Div(num2, den2) => n1 == num2 / den2
      case Div(num1, den1) =>
        other match
          case Entire(n)       => num1 / den1 == n
          case Div(num2, den2) => num1 / den1 == num2 / den2

object Number:
  def entire(value: Int) = Number.Entire(value)
  def div(num: Int, den: Int) = Number.Div(num, den)

extension (num: Int) infix def div(den: Int) = Number.div(num, den)
