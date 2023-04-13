package SortingAlgorithms

trait SortingAlgoImplInterface {
  def insertion_sort(arr:Array[Int]): Unit = println("Insertion!")
  def selection_sort(arr:Array[Int]):Unit = println("Selection!")
  def bubble_sort(arr:Array[Int], index:Int):Unit = println("Bubble!")
  def heap_sort(arr:Array[Int]):Unit = println("Heap!")
}
