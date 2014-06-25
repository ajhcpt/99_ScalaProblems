def packList[T](list: List[T]): List[List[T]] = list match {
  case Nil => List(Nil)
  case head :: tail => (head :: tail).takeWhile(_ == head) :: packList(tail.dropWhile(_ == head))
}

//provided solution
def packListSolution[T](list: List[T]): List[List[T]] = {
    val (packed, next) = list.span(_ == list.head)
    if (next == Nil) List(packed)
    else packed :: packListSolution(next)
}
packList(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
packList(List())

packListSolution(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
packListSolution(List())

