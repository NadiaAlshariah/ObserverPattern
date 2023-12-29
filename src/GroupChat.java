import java.util.*;

public class GroupChat implements IObservable {
    List<IObserver> observers = new ArrayList<IObserver>();

    public void add(IObserver observer){
        this.observers.add(observer);
    }
    public void remove(IObserver observer) {
        this.observers.remove(observer);
    }
    public void notification(){
        for(IObserver observer: observers){
            observer.update();
        }
    }
}
