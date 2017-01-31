import scala.io.Source

val in = Source
val words = in.getLines
val mnem  = Map('2' -> "ABC", '3' - > "DEF", '4' -> "GHI", '5' -> "JKL", '6'-> "MNO", '7'-> "PQRS", '8'-> "TUV", '9'-> "WXYZ")

/** Invert the mnem map to give a map from chars 'A' ... 'Z' to '2' ... '9' */
// val charCode: Map[Char, Char] =

/** Maps a word to the digit string it can represent, e.g. "Java" -> "" */
// def wordCode(word: String): String =

/**
  *  A map from digit strings to
  */
