def removeAt[T](index: Int, list: List[T]): (List[T], T) = {
  if (index >= 0 && list.length - index >= 1)
    (list.take(index) ::: list.takeRight(list.length - index - 1), list.apply(index))
  else
    throw new IndexOutOfBoundsException
}
removeAt(3, List('a, 'b, 'c, 'd))
//removeAt(-1, List('a, 'b, 'c, 'd))
//removeAt(4, List('a, 'b, 'c, 'd))
removeAt(0, List('a, 'b, 'c, 'd))
