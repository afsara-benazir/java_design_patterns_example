package ObserverPatternEx1;

public class GrabStocks {
    public static void main(String[] args) {

        StockGrabber stockGrabber = new StockGrabber ();

        StockObserver observer1 = new StockObserver ( stockGrabber );

        stockGrabber.setIbmPrice ( 1 );
        stockGrabber.setAaplPrice ( 2 );
        stockGrabber.setGoogPrice ( 3 );

        StockObserver observer2 = new StockObserver ( stockGrabber );

        stockGrabber.setIbmPrice ( 3 );
        stockGrabber.setAaplPrice ( 5 );
        stockGrabber.setGoogPrice ( 7 );


    }
}
