def rotate[T](number: Int, list: List[T]): List[Any] = {
  if (number > 0)
    list.takeRight(list.length  - number) ::: list.take(number)
  else
    list.takeRight(math.abs(number)) ::: list.take(list.length - math.abs(number))
}

rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
rotate(-3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

