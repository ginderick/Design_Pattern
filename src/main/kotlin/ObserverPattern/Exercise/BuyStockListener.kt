package ObserverPattern.Exercise

class BuyStockListener: Observer {
    override fun update(price: Float) {
        if(price<95) {
            println("Buying stock because price is low")
        }
    }
}