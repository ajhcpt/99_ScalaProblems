def slice[T](from: Int, to: Int, list: List[T]): List[T] = {
  list.drop(from).dropRight(list.length - to)
  //or
  //list.drop(from).take(to - from)
}

slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
slice(0, 5, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))