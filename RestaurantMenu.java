/**
 * Created by jeffbrinkley on 1/30/17.
 * This is a database for a restaurant's menu indluding name, cost, menu number, etc...
 */
public class RestaurantMenu {
    String itemName;
    double itemCost;
    boolean isItASandwich;
    boolean isItOnSale;
    int menuNumber;
    int qtyOnHand;
    int[] qtyNeededToOrder;

    //constructor
    public RestaurantMenu(String itemName, double itemCost, boolean isItASandwich, boolean isItOnSale, int menuNumber, int qtyOnHand, int[] qtyNeededToOrder) {
        this.itemName = itemName;
        setItemCost(itemCost);
        this.isItASandwich = isItASandwich;
        this.isItOnSale = isItOnSale;
        this.menuNumber = menuNumber;
        this.qtyOnHand = qtyOnHand;
        this.qtyNeededToOrder = qtyNeededToOrder;
    }

    //getter setter
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemCost() {
        return itemCost;
    }

    //conditional
    public void setItemCost(double itemCost) {
        if (itemCost < 20){
        this.itemCost = itemCost;}
        else {System.out.println("Your item is expensive!");}
    }

    public boolean isItASandwich() {
        return isItASandwich;
    }

    public void setItASandwich(boolean itASandwich) {
        isItASandwich = itASandwich;
    }

    public boolean isItOnSale() {
        return isItOnSale;
    }

    public void setItOnSale(boolean itOnSale) {
        isItOnSale = itOnSale;
    }

    public int getMenuNumber() {
        return menuNumber;
    }

    public void setMenuNumber(int menuNumber) {
        this.menuNumber = menuNumber;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public int[] getQtyNeededToOrder() {
        return qtyNeededToOrder;
    }

    public void setQtyNeededToOrder(int[] qtyNeededToOrder) {
        this.qtyNeededToOrder = qtyNeededToOrder;
    }

    public static void main(String[] args) {
        int[] qtyNeededToOrder = new int[10];
        RestaurantMenu myRestaurantMenu = new RestaurantMenu("Steak", 25, false, false, 5, 100, qtyNeededToOrder);
        RestaurantMenu hisRestaurantMenu = new RestaurantMenu("Burger", 15, true, true, 4, 40, qtyNeededToOrder);


    System.out.println("The item name for my restaurant menu is: " + myRestaurantMenu.getItemName());
    System.out.println("The item name for his restaurant menu is: " + hisRestaurantMenu.getItemName());
    }


}
