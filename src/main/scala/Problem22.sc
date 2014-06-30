def range(start: Int, end: Int): List[Int] = {
  if (start <= end)
    start :: range(start + 1, end)
  else
    Nil
}

range(1, 75)