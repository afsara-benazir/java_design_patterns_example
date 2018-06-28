package StatePatternEx;

public class ATMMachine {
    ATMState atmState;

    ATMState hasCard;
    ATMState noCard;
    ATMState hasPin;
    ATMState AtmHasnoCash;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine() {

        //atm machine can have one of these four states
        hasCard = new HasCard (this);
        noCard = new NoCard (this);
        hasPin = new HasPin (this);
        AtmHasnoCash = new NoCash (this);

        //by default has noCard state
        atmState = noCard;

        if (cashInMachine < 0) {
            atmState = AtmHasnoCash;
        }

    }

    void setATMState(ATMState newATMState) {
        atmState = newATMState;
    }

    public void setCashInMachine(int newCashInMachine) {
        cashInMachine = newCashInMachine;
    }

    public void insertCardinAtmMachine() {
        atmState.insertCard ();
    }

    public void ejectCardfromAtmMachine() {
        atmState.ejectCard ();
    }

    public void insertPininAtmMachine(int pinEntered) {
        atmState.insertPin ( pinEntered);
    }

    public void requestCashFromAtmMachine(int cashToWithdraw) {
        atmState.requestCash ( cashToWithdraw );
    }

    public ATMState getYesCardState() {
        return hasCard;
    }

    public ATMState getNoCardState() {
        return noCard;
    }


    public ATMState getHasPin() {
        return hasPin;
    }

    public ATMState getNoCashState() {
        return AtmHasnoCash;
    }



}
