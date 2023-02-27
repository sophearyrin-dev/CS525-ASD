package without.observer.myobserver;

public class Notification {

    public void handleStockChange(Stock stock){
        System.out.println("handleStockChange(Stock stock) : " + stock);
    }
}
