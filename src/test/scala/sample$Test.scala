import org.scalatest.FunSuite
import week3._

class SetSuite extends FunSuite {

  test("An empty Set should have size 0") {
    def singleton[T](elem: T) = new Cons[T](elem, new Nil[T]())
    
  }

}