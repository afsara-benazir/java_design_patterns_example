package VendingMachineEx;

public class InitialState implements VendingState {

    VendingMachine vendingMachine;

    public InitialState(VendingMachine newVendingMachine) {
        vendingMachine = newVendingMachine;
    }

    @Override
    public void selectItem() {
        System.out.println ("items selected");
        vendingMachine.setVendingState ( vendingMachine.getItemSelectedState() );

    }

    @Override
    public void showPriceOfItem() {

    }

    @Override
    public void insertCurrency() {
        System.out.println ("you havent entered any currency");
    }

    @Override
    public void getDelivery() {

    }

    @Override
    public void getChange() {

    }
}
