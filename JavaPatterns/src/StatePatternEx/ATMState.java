package StatePatternEx;

public interface ATMState {
    public void insertCard();
    public void ejectCard();
    public void insertPin(int pinNo);
    public void requestCash(int CashAmount);

}


