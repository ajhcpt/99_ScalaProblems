//my solution
def compressList(list: List[Symbol]): List[Symbol] = {
  def compressListRec(inputList: List[Symbol], outputList: List[Symbol]): List[Symbol] = inputList match {
    case x :: y :: xs => if(x == y) compressListRec(y :: xs, outputList) else compressListRec(y :: xs, outputList :+ x)
    case x :: Nil => compressListRec(Nil, outputList :+ x)
    case Nil => outputList
  }
  compressListRec(list, List())
}

//provided solution
def compressListSolution[T](list: List[T]): List[T] = list match {
  case Nil => Nil
  case head :: tail => head :: compressListSolution(tail.dropWhile(_ == head))
}

compressList(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e, 'f))
compressList(List('a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e, 'f))
compressListSolution(List('a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e, 'f))
//compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))