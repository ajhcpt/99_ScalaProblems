def encodeDirect[T](list: List[T]): List[(Int, T)] = {
  if (list.isEmpty) Nil
  else {
    val (packed, next) = list.span(_ == list.head)
    (packed.length, packed.head) :: encodeDirect(next)
  }
}
encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))