import SortingAlgorithms.{HeapMethodsImpl, SortingAlgoImpl}
import SearchingAlgorithms.SearchingAlgoImpl

@main
def main(): Unit = {
  var arr:Array[Int] = Array(4,1,3,2,16,9,10,14,8,7)

  var instanceSortingAlgo:SortingAlgoImpl = SortingAlgoImpl()
   println("----------------Before-------------")
   for(num <- arr){
     println(num)
   }
   println("\n")
  instanceSortingAlgo.heap_sort(arr)
   println("----------------After--------------")
   for (num <- arr) {
     println(num )
   }


}