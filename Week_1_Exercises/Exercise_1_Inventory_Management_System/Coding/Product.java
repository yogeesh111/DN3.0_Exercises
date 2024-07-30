package Exercise_1_Inventory_Management_System;

public class Product {
   private String productId;
   private String productName;
   private int quantity;
   private long price;

    public Product(String productId, String productName, int quality, long price)
    {
        this.productId=productId;
        this.productName=productName;
        this.quantity=quality;
        this.price=price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
