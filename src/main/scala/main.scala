import SortingAlgorithms.{HeapMethodsImpl, SortingAlgoImpl}
import SearchingAlgorithms.SearchingAlgoImpl

@main
def main(): Unit = {
  var arr:Array[Int] = Array(5,9,3,1,2,8,4,7,6)

  // var instanceSortingAlgo:SortingAlgoImpl = SortingAlgoImpl()
   var heapMethodsImplInstance:HeapMethodsImpl = HeapMethodsImpl()
   println("----------------Before-------------")
   for(num <- arr){
     println(num)
   }
   println("\n")
    arr = heapMethodsImplInstance.create_heap(arr)
   println("----------------After--------------")
   for (num <- arr) {
     println(num )
   }


}