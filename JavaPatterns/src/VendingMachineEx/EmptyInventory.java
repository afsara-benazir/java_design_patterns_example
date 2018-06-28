package VendingMachineEx;

public class EmptyInventory implements VendingState {

    VendingMachine vendingMachine;

    public EmptyInventory(VendingMachine newVendingMachine){
        vendingMachine = newVendingMachine;
    }
    @Override
    public void selectItem() {

    }

    @Override
    public void showPriceOfItem() {

    }

    @Override
    public void insertCurrency() {

    }

    @Override
    public void getDelivery() {

    }

    @Override
    public void getChange() {

    }
}
