def packListSolution[T](list: List[T]): List[List[T]] = {
  val (packed, next) = list.span(_ == list.head)
  if (next == Nil) List(packed)
  else packed :: packListSolution(next)
}

//provided solution
def encodeListSolution[T](list: List[T]): List[(Int, T)] = {
  packListSolution(list).map(x => (x.length, x.head))
}

encodeListSolution(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))