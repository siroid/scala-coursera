val n = 7

def isPrime(n: Int) = (2 until n) forall (n % _ != 0)

((1 until n) map (i =>
  (1 until i) map (j => (i, j)))).flatten

(1 until n) flatMap (i =>
  (1 until i) map (j => (i, j))) filter (pair => isPrime(pair._1 + pair._2))

val romanNumerals = Map("I" -> 1, "V" -> 5, "X" -> 10)

val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern")

capitalOfCountry get "andorra"
capitalOfCountry.get("US").map(_ + "j")

def showCapital(country: String) = capitalOfCountry.get(country) match {
  case Some(capital) => capital
  case None => "missing data"
}

showCapital("US")
showCapital("h")

val fruit = List("apple", "pear", "orange", "pineapple")