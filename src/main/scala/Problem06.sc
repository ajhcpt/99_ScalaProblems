def reverseList(list: List[Int]): List[Int] = {
  def reverseRec(inputList: List[Int], outputList: List[Int]): List[Int] = inputList match {
    case x :: xs => reverseRec(xs, x +: outputList)
    case Nil => outputList
  }
  reverseRec(list, List())
}

reverseList(List(1, 2, 3, 4, 5, 6, 7))

def isPalindrome(list: List[Int]): Boolean = {
  val reverselist: List[Int] = reverseList(list)
  def listItemCompare(list: List[Int], revList: List[Int]): Boolean = (list, revList) match {
    case (x :: xs, y :: ys) => if(x == y) listItemCompare(xs, ys) else false
    case (Nil, Nil) => true
    case (x, Nil) => false
    case (Nil, x) => false
  }
  listItemCompare(list, reverselist)
}

def isPalindromeShort(list: List[Int]): Boolean = list == reverseList(list)

isPalindrome(List(1, 2, 3, 4, 5, 6, 7, 4, 3, 2, 1))
isPalindromeShort(List(1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1))
