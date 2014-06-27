def split[T](number: Int, list: List[T]): (List[T], List[T]) = {
  list.splitAt(number)
}

split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
split(5, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))