package StatePatternEx;

public class NoCard implements ATMState {
    ATMMachine atmMachine;

    public NoCard(ATMMachine newAtmMachine) {
        atmMachine = newAtmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println ("card inserted now enter a pin");
        atmMachine.setATMState ( atmMachine.getYesCardState () );
    }

    @Override
    public void ejectCard() {
        System.out.println ("eneter a card first");

    }

    @Override
    public void insertPin(int pinNo) {
        System.out.println ("enter a card first");
    }

    @Override
    public void requestCash(int CashAmount) {
        System.out.println ("enter a card first");
    }
}
