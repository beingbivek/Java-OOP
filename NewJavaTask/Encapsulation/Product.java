package NewJavaTask.Encapsulation;

public class Product {
    private String productName;
    private int productId;
    private double price;
    private int stockQuantity;

    // setter methods
    public void setProductName(String name) {
        productName = name;
    }

    public void setProductId(int id) {
        productId = id;
    }

    public void setPrice(double p) {
        if (p >= 0) {
            price = p;
        }
    }

    // getter methods
    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    // method to restock
    public void restock(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
        }
    }

    // method to purchase
    public void purchase(int quantity) {
        if (quantity > 0 && quantity <= stockQuantity) {
            stockQuantity -= quantity;
        }
    }

    public static void main(String[] args) {
        Product item = new Product();
        item.setProductName("Wireless Mouse");
        item.setProductId(101);
        item.setPrice(799.99);
        item.restock(50);
        item.purchase(3);

        System.out.println("Product: " + item.getProductName());
        System.out.println("ID: " + item.getProductId());
        System.out.println("Price: " + item.getPrice());
        System.out.println("Stock Left: " + item.getStockQuantity());
    }
}
