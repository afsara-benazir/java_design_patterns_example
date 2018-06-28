package ObserverPatternEx2;

public class subjectClass implements Subject {

    private String msg;
    @Override
    public void subscribe(Observer o) {

    }

    public subjectClass(String msg) {
        this.msg = msg;
    }

    public String getMsg() {

        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void unsubscribe(Observer o) {

    }

    @Override
    public void notifyAllObservers() {

    }
}
