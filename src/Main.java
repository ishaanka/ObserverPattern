import Observable.IStockObservable;
import Observable.SamsungPhoneObservable;
import Observers.EmailObserver;
import Observers.IObserver;
import Observers.MobileObserver;

public class Main {
    public static void main(String[] args) {

        IStockObservable samsungStock = new SamsungPhoneObservable();
        IObserver mobileObserver = new MobileObserver(samsungStock);
        IObserver mailObserver = new EmailObserver(samsungStock);

        samsungStock.addObserver(mobileObserver);
        samsungStock.addObserver(mailObserver);

        samsungStock.setStock(10);


    }
}