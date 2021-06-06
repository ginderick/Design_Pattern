package ObserverPattern.Exercise



fun main(args: Array<String>) {

    var stockExchange = StockExchange()
    stockExchange.addObserver(BuyStockListener())
    stockExchange.addObserver(SellStockListener())
    stockExchange.start()
}