package SortingAlgorithms

class HeapMethodsImpl extends HeapMethodsImplInterface {
  def pile_up(arr: Array[Int], index:Int): Unit = {
    var l:Int = 2 * index
    var r:Int = 2 * index + 1
    var max:Int = 0
    if((l <= arr.length) && (arr(l) > arr(index))){
        max = l
    }else{
      max = index
    }

    if((r <= arr.length) && (arr(r) > arr(max))){
      max = r
    }
    if(max != index ){
      var temp = arr(index)
      arr(index) = arr(max)
      arr(max) = temp
      pile_up(arr,max)
    }
  }


  def create_heap(arr:Array[Int]): Array[Int] = {
    var i:Int = 0
    while (((arr.length)/2) != 0){
      pile_up(arr,i)
    }
    return arr
  }

}
