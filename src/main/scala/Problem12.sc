def packListSolution[T](list: List[T]): List[List[T]] = {
  val (packed, next) = list.span(_ == list.head)
  if (next == Nil) List(packed)
  else packed :: packListSolution(next)
}

//provided solution
def encodeListSolution[T](list: List[T]): List[(Int, T)] = {
  packListSolution(list).map(x => (x.length, x.head))
}

def decode[T](list: List[(Int, T)]): List[T] = {
  list.flatMap(x => List.fill(x._1)(x._2))
}

decode(List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))