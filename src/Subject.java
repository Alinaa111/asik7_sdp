// Subject Interface
public interface Subject {
    // General methods of managing subscribers
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
