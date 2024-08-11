package Observers;

import Observable.IStockObservable;

public class MobileObserver implements IObserver{
    IStockObservable observable;

    public MobileObserver(IStockObservable observable) {
       this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("New stock available : " + observable.getStock());
    }
}
