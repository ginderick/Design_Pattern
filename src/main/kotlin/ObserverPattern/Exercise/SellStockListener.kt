package ObserverPattern.Exercise

class SellStockListener: Observer {
    override fun update(price: Float) {
        if (price>105) {
            println("Selling stock because price is too high")
        }
    }
}