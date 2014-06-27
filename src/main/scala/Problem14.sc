def duplicate[T](list: List[T]): List[T] = list match {
  case x :: xs => x :: x :: duplicate(xs)
  case Nil => Nil
}

//provided solution
def duplicateSolution[T](list: List[T]): List[T] = {
  list.flatMap(x => List(x, x))
}

duplicate(List('a, 'b, 'c, 'c, 'd))

