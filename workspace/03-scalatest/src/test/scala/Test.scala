import org.scalatest.FunSuite
import it.unibo.test.{Sometrait, Someobject}
import org.scalamock.scalatest.MockFactory

class MyTests extends FunSuite with MockFactory {
  test("An empty Set should have size 0") {
    println("Test1")
    assert(Set.empty.size == 0)
  }
  test("Some useless test") {
    println("Test2")
    val someStub = stub[Sometrait]
    (someStub.f _).when().returns(42)
    assert(someStub.f == 42)
  }
}
