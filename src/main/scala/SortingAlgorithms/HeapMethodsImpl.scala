package SortingAlgorithms

class HeapMethodsImpl extends HeapMethodsImplInterface {
  def heapify(arr: Array[Int], n: Int, i: Int): Unit = {
    var largest = i
    val left = 2 * i + 1
    val right = 2 * i + 2

    // If left child is larger than root
    if (left < n && arr(left) > arr(largest)) {
      largest = left
    }

    // If right child is larger than largest so far
    if (right < n && arr(right) > arr(largest)) {
      largest = right
    }

    // If largest is not root
    if (largest != i) {
      // Swap root and largest
      val swap = arr(i)
      arr(i) = arr(largest)
      arr(largest) = swap

      // Recursively heapify the affected sub-tree
      heapify(arr, n, largest)
    }
  }


  

}
