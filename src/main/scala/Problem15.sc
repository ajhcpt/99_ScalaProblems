def duplicateN[T](number: Int, list: List[T]): List[T] = {
  list.flatMap(x => List.fill(number)(x))
}

duplicateN(3, List('a, 'b, 'c, 'c, 'd))
duplicateN(8, List('a, 'b, 'c, 'c, 'd))