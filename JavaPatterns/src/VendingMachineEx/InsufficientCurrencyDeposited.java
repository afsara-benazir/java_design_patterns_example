package VendingMachineEx;

public class InsufficientCurrencyDeposited implements VendingState {
   VendingMachine vendingMachine;

   public InsufficientCurrencyDeposited(VendingMachine newVendingMachine)
   {
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
        System.out.println ("currency inserted");
        vendingMachine.setVendingState ( vendingMachine.deliverWithNoChange
        );
    }

    @Override
    public void getDelivery() {
        System.out.println ("you havent entered any currency");
    }

    @Override
    public void getChange() {
        System.out.println ("you havent entered any currency");
    }
}
