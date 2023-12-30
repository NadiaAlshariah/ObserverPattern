import java.util.*;

public class GroupChat implements IObservable {
    private final String id;
    List<IObserver> observers;
    String message;

    public GroupChat(String id){
        this.id = id;
        observers = new ArrayList<IObserver>();
    }

    public void add(IObserver observer){
        this.observers.add(observer);
        System.out.println();
    }
    public void remove(IObserver observer) {
        this.observers.remove(observer);
    }
    public void notifyObservers(){
        for(IObserver observer: observers){
            observer.update(message);
        }
    }

    public void messageChanged(){
        notifyObservers();
    }

    public void setMessage(String message){
        this.message = message;
        messageChanged();
    }

    public String getId() {
        return id;
    }
}