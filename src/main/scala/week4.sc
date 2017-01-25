object List {
  def apply[T](x1: T, x2: T):List[T] =
    new Cons[T](x1, new Cons[T](x2, new Nil[T]))
}

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

val i = List(1, 2)
i.head