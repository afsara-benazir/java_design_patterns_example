package ObserverPatternEx;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach ( this );
    }

    @Override
    public void update() {
        System.out.println ( "octal string: " + Integer.toOctalString ( subject.getState () ) );
    }
}
