def insertAt[T](element: T, position: Int, list: List[T]): List[T] = {
  if (position >= 0 && list.length - position >= 0)
    list.take(position) ::: List(element) ::: list.takeRight(list.length - position)
  else
    throw new IndexOutOfBoundsException
}

def insertAtSolution[T](element: T, position: Int, list: List[T]): List[T] = list.splitAt(position) match {
  case (pre, post) => pre ::: element :: post
}

insertAt('new, 0, List('a, 'b, 'c, 'd))
insertAt('new, 1, List('a, 'b, 'c, 'd))
insertAt('new, 2, List('a, 'b, 'c, 'd))
insertAt('new, 3, List('a, 'b, 'c, 'd))
insertAt('new, 4, List('a, 'b, 'c, 'd))
//insertAt('new, 5, List('a, 'b, 'c, 'd))