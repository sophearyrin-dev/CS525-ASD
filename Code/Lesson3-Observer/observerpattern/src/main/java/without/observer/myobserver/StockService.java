package without.observer.myobserver;

public class StockService {

    public HistoryLogger historyLogger;
    public Trade trade;
    public Notification notification;

    public void changeStockValue(String stockName, double value){

        Stock stock = new Stock(stockName,value);
        historyLogger.log(stock);
        trade.trade(stock);
        notification.handleStockChange(stock);
    }

    public void setHistoryLogger(HistoryLogger historyLogger){
        this.historyLogger = historyLogger;
    }

    public void setTrade(Trade trade){
        this.trade = trade;
    }

    public void setNotification(Notification notification){
        this.notification = notification;
    }
}
