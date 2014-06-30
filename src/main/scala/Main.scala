import scala.util.Random

/**
 * Created by andrewhe on 25/06/2014.
 */
object Main extends App {
  def removeAt[T](index: Int, list: List[T]): (List[T], T) = {
    if (index >= 0 && list.length - index >= 1)
      (list.take(index) ::: list.takeRight(list.length - index - 1), list.apply(index))
    else
      throw new IndexOutOfBoundsException
  }

  def randomSelect[T](number: Int, list: List[T]): List[T] = {
    def randomSelectRec(numberRec: Int, listRec: List[T]): List[T] = {
      if (numberRec > 0) {
        val random = new Random().nextInt(listRec.length + 1)
        removeAt(random, listRec)._2 :: randomSelectRec(numberRec - 1, removeAt(random, listRec)._1)
      }
      else
        List()


    }
    randomSelectRec(number, list)
  }

  randomSelect(4, List('a, 'b, 'c, 'd, 'f, 'g, 'h))

}
