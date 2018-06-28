package VendingMachineEx;

public class VendingMachine {

    VendingState vendingState;

    VendingState deliverWithNoChange;
    VendingState deliverWithChange;
    VendingState insufficientCurrDeposited;
    VendingState emptyInventory;

    boolean inventoryState = true; //true means inventory has items


    public VendingMachine() {

        //vending machine can have one of these four states
        deliverWithNoChange = new DeliverWithNoChange (this);
        deliverWithChange = new DeliverWithChange (this);
        insufficientCurrDeposited = new InsufficientCurrencyDeposited (this);
        emptyInventory = new EmptyInventory (this);

        //by default has no currency deposited
        vendingState = insufficientCurrDeposited;

    }

    void setVendingState(VendingState newVendingState) {
        vendingState = newVendingState;
    }
    public void selectItemFromVendingMachine() {vendingState.selectItem ();}
    public void insertCurrencyInVendingMachine() {vendingState.insertCurrency ();}

    public VendingState getDeliverWithNoChange() {return deliverWithNoChange;}
    public VendingState getDeliverWithChange() {return deliverWithChange;}
    public VendingState getEmptyInventory() {return emptyInventory;}
    public VendingState getItemSelectedState() {return insufficientCurrDeposited;}

}
