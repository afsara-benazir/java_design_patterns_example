package VendingMachineEx;

public class TestVendingMachine {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine ();

        vendingMachine.selectItemFromVendingMachine ();
        vendingMachine.insertCurrencyInVendingMachine ();
        vendingMachine.getDeliverWithNoChange ();

    }

}
