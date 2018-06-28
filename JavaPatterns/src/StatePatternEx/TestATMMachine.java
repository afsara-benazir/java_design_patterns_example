package StatePatternEx;

public class TestATMMachine {

    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine ();

        atmMachine.insertCardinAtmMachine ();
        atmMachine.ejectCardfromAtmMachine ();

        atmMachine.insertCardinAtmMachine ();
        atmMachine.insertPininAtmMachine ( 1234 );
        atmMachine.requestCashFromAtmMachine ( 2000 );

        atmMachine.insertCardinAtmMachine ();
        //atmMachine.insertPininAtmMachine ( 1234 );


    }

}
