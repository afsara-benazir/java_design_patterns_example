package StatePatternEx;

public class NoCash implements ATMState {

    ATMMachine atmMachine;
    public NoCash(ATMMachine newAtmMachine)
    {
        atmMachine = newAtmMachine;
    }
    @Override
    public void insertCard() {
        System.out.println ("we dont have cash");

    }

    @Override
    public void ejectCard() {
        System.out.println ("no money.also you didnt enter a card");
    }

    @Override
    public void insertPin(int pinNo) {
        System.out.println ("no money");
    }

    @Override
    public void requestCash(int CashAmount) {
        System.out.println ("no money");
    }
}
