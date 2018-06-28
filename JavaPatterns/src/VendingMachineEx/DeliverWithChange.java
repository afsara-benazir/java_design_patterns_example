package VendingMachineEx;

public class DeliverWithChange implements VendingState{

    VendingMachine vendingMachine;

    public DeliverWithChange(VendingMachine newVendingMachine){
        vendingMachine = newVendingMachine;
    }
    @Override
    public void selectItem() {
        System.out.println ("cannot select more than one item at a time");
    }

    @Override
    public void showPriceOfItem() {

    }

    @Override
    public void insertCurrency() {
        System.out.println ("currency already inserted");
    }

    @Override
    public void getDelivery() {
        System.out.println ("product delivered");
    }

    @Override
    public void getChange() {
        System.out.println ("no change.you have given the exact amount of money");
    }
}
