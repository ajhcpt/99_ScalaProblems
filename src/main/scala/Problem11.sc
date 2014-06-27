def packListSolution[T](list: List[T]): List[List[T]] = {
  val (packed, next) = list.span(_ == list.head)
  if (next == Nil) List(packed)
  else packed :: packListSolution(next)
}

def encodeListSolution[T](list: List[T]): List[(Int, T)] = {
  packListSolution(list).map(x => (x.length, x.head))
}

/*
def encodeModified[T](list: List[T]): List[Either[T, (Int, T)]] = {
  encodeListSolution(list).map(x => if (x._1 == 1) Left(x._2) else Right(x) )
}
*/

def encodeModified[T](list: List[T]): List[Any] = {
  encodeListSolution(list).map(x => if (x._1 == 1) x._2 else x )
}


encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))