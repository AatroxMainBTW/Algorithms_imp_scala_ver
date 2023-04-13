package SearchingAlgorithms

class SearchingAlgoImpl extends SearchingAlgoImplInterface{
  override def linearSearchMin(arr:Array[Int], first:Int, last:Int): ArrayHelper = {
    var arrH:ArrayHelper = ArrayHelper(arr(first),first)

    var i:Int = first
    while (i != last) {
      if(arrH.value >= arr(i)){
        arrH.value = arr(i)
        arrH.index = i
      }
      i = i+ 1
    }
    return arrH
  }
}
