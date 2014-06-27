def drop[T](number: Int, list: List[T]): List[T] = {
  list.filter(x => (list.indexOf(x) + 1) % number != 0)
}

drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))