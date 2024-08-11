package Observable;

import Observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public class SamsungPhoneObservable implements IStockObservable{

    List<IObserver> observers;
    Integer stock;

    public SamsungPhoneObservable() {
       observers = new ArrayList<IObserver>();
       stock = 0;
    }

    public void addObserver(IObserver observer) {
         observers.add(observer);
    }
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }
    public void setStock(int stock) {
        this.stock = stock;
            notifyObservers();
    }
    public int getStock() {
        return this.stock;
    }
}
