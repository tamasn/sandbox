import cats.free.Free

import scala.annotation.tailrec

object FreeMergeSort {
  def mergeSort[A](l: List[A])(implicit o: Ordering[A]): List[A] = {
    if (l.size <= 1) {
      l
    } else {
      val p = l.size / 2
      val lh = mergeSort(l.take(p))
      val rh = mergeSort(l.drop(p))
      merge(Nil, lh, rh)
    }
  }

  @tailrec
  def merge[A](acc: List[A], lh: List[A], rh: List[A])(implicit o: Ordering[A]): List[A] = (lh, rh) match {
    case (Nil, Nil) => acc.reverse
    case (Nil, rh)  => acc.reverse ++ rh
    case (lh, Nil)  => acc.reverse ++ lh
    case (lh @ l :: ls, rh @ r :: rs) =>
      if (o.lteq(l, r))
        merge(l :: acc, ls, rh)
      else
        merge(r :: acc, lh, rs)
  }
}
