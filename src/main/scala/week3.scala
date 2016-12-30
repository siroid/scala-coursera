package week3

trait List[T] {
  def isEmpty: Boolean

  def head: T

  def tail: List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty: Boolean = false
}

class Nil[T] extends List[T] {
  def isEmpty: Boolean = true

  def head: Nothing = throw new NoSuchMethodError("Nil.head")

  def tail: Nothing = throw new NoSuchMethodError("Nil.tail")
}

object sample {
  def singleton[T](elem: T) = new Cons[T](elem, new Nil[T]())
}
