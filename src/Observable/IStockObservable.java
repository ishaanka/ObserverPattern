package Observable;
import Observers.IObserver;

public interface IStockObservable {
    public void addObserver(IObserver observer);
    public void removeObserver(IObserver observer);
    public void notifyObservers();
    public void setStock(int stock);
    public int getStock();
}
