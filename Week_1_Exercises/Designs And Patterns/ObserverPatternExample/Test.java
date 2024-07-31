package ObserverPatternExample;

public class Test {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket("NIFTY", 200.00);
        MobileApp mobileApp = new MobileApp();
        WebApp webApp = new WebApp();
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);
        stockMarket.setStockPrice(154.00);
        stockMarket.setStockPrice(43.00);
    }
}
