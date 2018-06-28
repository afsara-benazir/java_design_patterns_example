package StatePatternEx;

public class HasPin implements ATMState {

    ATMMachine atmMachine;

    public HasPin(ATMMachine newAtmMachine) {
        atmMachine = newAtmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println ("already have a card cant enter mre than ppone card");

    }

    @Override
    public void ejectCard() {
        System.out.println ("card ejected");
        atmMachine.setATMState ( atmMachine.getNoCardState () );
    }

    @Override
    public void insertPin(int pinNo) {
        System.out.println ("pin once entered");

    }

    @Override
    public void requestCash(int CashAmount) {
        if (CashAmount > atmMachine.cashInMachine) {
            System.out.println ("sorry dont have that cash");
            System.out.println ("card ejected");
            atmMachine.setATMState ( atmMachine.getNoCardState () );
        }

        else
        {
            System.out.println (CashAmount + " is provided");
            atmMachine.setCashInMachine ( atmMachine.cashInMachine - CashAmount );

            System.out.println ("card ejected");
            atmMachine.setATMState ( atmMachine.getNoCardState () );

            if(atmMachine.cashInMachine <= 0)
            {
                atmMachine.setATMState ( atmMachine.getNoCashState () );
            }
        }

    }
}
