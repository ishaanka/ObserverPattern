package Observers;

import Observable.IStockObservable;

public class EmailObserver implements IObserver {
    IStockObservable observable;

    public EmailObserver(IStockObservable observable) {
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("New stock available via Email : " + observable.getStock());
    }
}
