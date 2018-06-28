package StatePatternEx;

public class HasCard implements ATMState {

    ATMMachine atmMachine;

    public HasCard(ATMMachine newATMMachine) {
        atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("cant  enter more than one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("card ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinNo) {
        if(pinNo == 1234) {
            System.out.println("correct pin");
            atmMachine.correctPinEntered = true;
            atmMachine.setATMState(atmMachine.getHasPin());
        }
        else {
            System.out.println("wrong pin");
            atmMachine.correctPinEntered = false;
            atmMachine.setATMState(atmMachine.getNoCardState());
            System.out.println ("card ejected");
        }
    }

    @Override
    public void requestCash(int CashAmount) {
        System.out.println ("enter pin first");
    }
}
