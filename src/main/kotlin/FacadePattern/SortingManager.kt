package FacadePattern

class SortingManager() {

    private var bubbleSort = BubbleSort()
    private var mergeSort = MergeSort()
    private var quickSort = QuickSort()

    fun doBubbleSort() {
        this.bubbleSort.sort()
    }

    fun doMergeSort() {
        this.mergeSort.sort()
    }

    fun doQuickSort() {
        this.quickSort.sort()
    }


}