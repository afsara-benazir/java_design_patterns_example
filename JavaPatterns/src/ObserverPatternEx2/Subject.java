package ObserverPatternEx2;

public interface Subject
{
    public void subscribe(Observer o);
    public void unsubscribe(Observer o);
    public void notifyAllObservers();
}
