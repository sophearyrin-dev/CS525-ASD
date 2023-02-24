package without.observer.myobserver;

public class Application {
    public static void main(String[] args) {

//        Stock stock1 = new Stock("stock1", 320);
//        Stock stock2 = new Stock("stock2", 500);

        StockService stockService = new StockService();

        HistoryLogger historyLogger = new HistoryLogger();
        Trade trade = new Trade();
        Notification notification = new Notification();

        stockService.setHistoryLogger(historyLogger);
        stockService.setTrade(trade);
        stockService.setNotification(notification);

        stockService.changeStockValue("stock1", 700);

    }
}
