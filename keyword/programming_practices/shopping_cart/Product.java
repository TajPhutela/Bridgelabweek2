package keyword.programming_practices.shopping_cart;

public class Product {
	private static double discount = 10.0; // Static discount shared by all products
    private final int productID; // Final variable
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProductDetails() {
        if (this instanceof Product) { // Using instanceof
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

}
