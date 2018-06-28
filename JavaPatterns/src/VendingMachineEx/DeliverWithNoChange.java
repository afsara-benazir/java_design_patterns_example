package VendingMachineEx;

public class DeliverWithNoChange implements VendingState {

   VendingMachine vendingMachine;

   public DeliverWithNoChange(VendingMachine newVendingMachine){
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
        System.out.println ("change returned");
    }
}
