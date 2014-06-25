/**
 * Created by andrewhe on 25/06/2014.
 */
object Main extends App {
  def compressFunctional[T](list: List[T]): List[T] = {
    list.foldRight(List[T] ()) { (b, a) =>
      if (a.isEmpty || a.head != b) b :: a else a
    }
  }
  compressFunctional(List('a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e, 'f))

  def packList[T](list: List[T]): List[List[T]] = list match {
    case Nil => Nil
    case head :: tail => tail.takeWhile(_ == head) :: packList(tail.dropWhile(_ == head))
  }

  packList(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))


}
