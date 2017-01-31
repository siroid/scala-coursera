import scala.io.Source

//val in = Source.fromURL("http://lamp.epfl.ch/files/content/sites/lamp/files/teaching/progfun/linuxwords")
//val words = in.getLines
val mnem  = Map('2' -> "ABC", '3' -> "DEF", '4' -> "GHI", '5' -> "JKL", '6'-> "MNO", '7'-> "PQRS", '8'-> "TUV", '9'-> "WXYZ")

/** Invert the mnem map to give a map from chars 'A' ... 'Z' to '2' ... '9' */
val charCode: Map[Char, Char] =
  for((digit, str) <- mnem; ltr<- str) yield ltr -> digit

/** Maps a word to the digit string it can represent, e.g. "Java" -> "" */
def wordCode(word: String): String = word map charCode

wordCode("JAVA")

/**
  *  A map from digit strings to the words that represent them,
  *  e.g. "5282" -> List("Java", "Kata", "Lava", ...)
  *  Note: A missing number should map to the empty set, e.g. "1111" -> List()
  */
