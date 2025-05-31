public class Product {
    private String productName;
    private String productId;
    private double price;
    private int stockQuantity;

    public Product(String productName, String productId, double price, int stockQuantity) {
        this.productName = productName;
        this.productId = productId;
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative. Setting to 0.");
            this.price = 0;
        }
        this.stockQuantity = stockQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative. Value not changed.");
        }
    }

    public void purchaseProduct(int quantity) {
        if (quantity > 0 && stockQuantity >= quantity) {
            stockQuantity -= quantity;
        } else {
            System.out.println("Invalid purchase quantity or insufficient stock.");
        }
    }

    public void restockProduct(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
        } else {
            System.out.println("Restock quantity must be positive.");
        }
    }
}