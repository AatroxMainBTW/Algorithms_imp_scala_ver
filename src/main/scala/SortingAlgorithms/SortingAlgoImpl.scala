package SortingAlgorithms
import SearchingAlgorithms.SearchingAlgoImpl
import SortingAlgorithms.HeapMethodsImpl
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
    val n = arr.length
    var heapMethodsInstance:HeapMethodsImpl = HeapMethodsImpl()
    // Build max heap
    for (i <- n / 2 - 1 to 0 by -1) {
      heapMethodsInstance.heapify(arr, n, i)
    }

    // Extract elements from heap one by one
    for (i <- n - 1 to 1 by -1) {
      // Swap root and last element
      val swap = arr(0)
      arr(0) = arr(i)
      arr(i) = swap

      heapMethodsInstance.heapify(arr, i, 0)
    }
  }}