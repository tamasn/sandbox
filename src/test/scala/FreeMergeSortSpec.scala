import org.scalatest._

class FreeMergeSortSpec extends FlatSpec with Matchers {
  "mergeSort" should "sort List(5, 2, 5, 3, 4, 1, 7)" in {
    FreeMergeSort.mergeSort(List(5, 2, 5, 3, 4, 1, 7)) should be(List(1, 2, 3, 4, 5, 5, 7))
  }

  it should "sort List(5, 2, 5, 3, 4, 1)" in {
    FreeMergeSort.mergeSort(List(5, 2, 5, 3, 4, 1)) should be(List(1, 2, 3, 4, 5, 5))
  }

  it should "sort List(5)" in {
    FreeMergeSort.mergeSort(List(5)) should be(List(5))
  }
  it should "sort List()" in {
    FreeMergeSort.mergeSort(List()) should be(List())
  }
}
