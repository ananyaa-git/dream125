// Define an enumeration for menu items.
// kfc
enum MenuItem {
    SpicyPanneer_BURGER(1001, 599),
    VEG_BURGER(1002, 499),
    FRIES(1003, 249),
    SODA(1004, 199);

    private final int code;
    private final double price;

    MenuItem(int code, double price) {
        this.code = code;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public static MenuItem fromCode(int code) {
        for (MenuItem item : values()) {
            if (item.getCode() == code) {
                return item;
            }
        }
        throw new IllegalArgumentException("Invalid menu item code: " + code);
    }
}

// Define a class for handling billing
class Bill {
    private double totalAmount;

    public Bill() {
        totalAmount = 0;
    }

    public void addItem(int itemCode) {
        MenuItem item = MenuItem.fromCode(itemCode);
        totalAmount += item.getPrice();
        System.out.println("Added: " + item.name() + " -RS" + item.getPrice());
    }

    public void printTotal() {
        System.out.println("Total Amount: RS" + totalAmount);
    }
}

// Example usage
public class KFCBillingSystem {
    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.addItem(1001); // Adding Spicy Panneer Burger
        bill.addItem(1001); 
        bill.addItem(1002); // Adding veg Burger
        bill.addItem(1003); // Adding Fries
        bill.addItem(1004); // Adding Soda
        bill.printTotal();  // Printing Total Amount
    }
}