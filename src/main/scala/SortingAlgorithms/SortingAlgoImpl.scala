package SortingAlgorithms
import SearchingAlgorithms.SearchingAlgoImpl
class SortingAlgoImpl extends SortingAlgoImplInterface {


  override def insertion_sort(arr:Array[Int]): Unit = {
    var i:Int = 0
    while (i != arr.length){
      var j:Int = i
      while (j != 0) {
        if(j != 0){
          if (arr(j) < arr(j - 1)) {
            var temp = arr(j - 1)
            arr(j - 1) = arr(j)
            arr(j) = temp

          } else {
            //do nothing
          }
        }

        j = j-1
      }
      i = i+ 1
    }
  }

  override def selection_sort(arr: Array[Int]): Unit = {
    var i:Int = 0
    var instanceSearchingAlgo:SearchingAlgoImpl = SearchingAlgoImpl()

    while(i != arr.length){
      var min = instanceSearchingAlgo.linearSearchMin(arr, i, arr.length)
      var temp = arr(i)
      arr(i) = min.value
      arr(min.index) = temp
      i = i+ 1

    }
  }

  override def bubble_sort(arr: Array[Int],index:Int): Unit = {
    var i:Int = arr.length-1
    var temp_index:Int = index
    while(i != temp_index){
      if(i != temp_index) {
        if (arr(i) < arr(i - 1)) {
          var temp: Int = arr(i)
          arr(i) = arr(i - 1)
          arr(i - 1) = temp

        }
      }
      i=i-1
    }
    if (i == temp_index && temp_index != (arr.length-1)){
      temp_index = temp_index + 1
      bubble_sort(arr, temp_index)
    }
  }

  override def heap_sort(arr: Array[Int]): Unit = {

  }
}