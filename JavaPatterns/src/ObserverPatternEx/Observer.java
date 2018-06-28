package ObserverPatternEx;

public abstract class Observer {
    public abstract void update();

    protected Subject subject;
}
