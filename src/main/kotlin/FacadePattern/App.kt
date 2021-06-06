package FacadePattern

fun main(args: Array<String>) {
    val manager = SortingManager()

    manager.doBubbleSort()
    manager.doMergeSort()

}