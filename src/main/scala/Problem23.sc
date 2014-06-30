import scala.util.Random

def removeAt[T](index: Int, list: List[T]): (List[T], T) = {
  if (index >= 0 && list.length - index >= 1)
    (list.take(index) ::: list.takeRight(list.length - index - 1), list.apply(index))
  else
    throw new IndexOutOfBoundsException
}

def randomSelect[T](number: Int, list: List[T]): List[T] = {
  def randomSelectRec(numberRec: Int, listRec: List[T]): List[T] = {
    if (numberRec > 0) {
      val random = new Random().nextInt(listRec.length)
      val (_, e) = removeAt(random, listRec)
      e :: randomSelectRec(numberRec - 1, removeAt(random, listRec)._1)
    }
    else
      Nil
  }
  randomSelectRec(number, list)
}

randomSelect(4, List('a, 'b, 'c, 'd, 'f, 'g, 'h))