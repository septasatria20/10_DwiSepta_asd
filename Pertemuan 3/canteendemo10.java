public class canteendemo10 {
    public String name;
    public double price;
    public int stock;

    public static void main(String[]args) {
        canteendemo10 item1 = new canteendemo10("Donat Kacang", 20000, 20);
        canteendemo10 item2 = new canteendemo10("Donat Cokelat", 20000, 20);
        canteendemo10 item3 = new canteendemo10("Donat Hazelnut", 20000, 20);
    }

    public canteendemo10 (String itemName, double itemPrice, int itemStock) {
        name = itemName;
        price = itemPrice;
        stock = itemStock;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }
}

