val list = List(List(1, 1), 2, List(3, List(5, 8)))

def flattenList(list: List[Any]): List[Any] = list flatMap {
  case l: List[_] => flattenList(l)
  case e => List(e)
}

flattenList(list)
