package VendingMachineEx;

public interface VendingState {
    public void selectItem();
    public void showPriceOfItem();
    public void insertCurrency();
    public void getDelivery();
    public void getChange();


}

