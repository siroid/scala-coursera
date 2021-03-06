val n = 7

def isPrime(n: Int) = (2 until n) forall (n % _ != 0)

((1 until n) map (i =>
  (1 until i) map (j => (i, j)))).flatten

(1 until n) flatMap (i =>
  (1 until i) map (j => (i, j))) filter (pair => isPrime(pair._1 + pair._2))

//Map
val romanNumerals = Map("I" -> 1, "V" -> 5, "X" -> 10)
val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern")

//Maps are functions
capitalOfCountry("US")

//Querying map
capitalOfCountry get "andorra"
capitalOfCountry.get("US").map(_ + "j")

def showCapital(country: String) = capitalOfCountry.get(country) match {
  case Some(capital) => capital
  case None => "missing data"
}

showCapital("US")
showCapital("h")

// Sorted and GroupBy
val fruit = List("apple", "pear", "orange", "pineapple")

fruit sortWith (_.length < _.length)
fruit.sorted

fruit groupBy (_.head)

//Default value
val cap1 = capitalOfCountry withDefaultValue "unknown"
cap1("Andorra")

//Map example
class Poly(val terms0: Map[Int, Double]) {
  def this(bindings: (Int, Double)*) = this(bindings.toMap)

  val terms = terms0 withDefaultValue (0.0)

  def +(other: Poly) = new Poly(terms ++ other.terms map adjust)

  def adjust(term: (Int, Double)): (Int, Double) = {
    val (exp, coeff) = term
    terms get exp match {
      case Some(coeff1) => exp -> (coeff + coeff1)
      case None => exp -> coeff
    }
  }

  override def toString =
    (for ((exp, coeff) <- terms.toList.sorted.reverse) yield coeff + "x^" + exp) mkString " + "
}

val p1 = new Poly(Map(1 -> 2.0, 3 -> 4.0, 5 -> 6.2))
val p2 = new Poly(Map(0 -> 3.0, 3 -> 7.0))
p1 + p2

