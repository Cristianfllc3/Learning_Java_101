package src.model;

public class ClothingItem {
    
    private String size;
    private String type;
    private double price;
    private int quantity;

    //And now is when de magic began :), na it simple to generate get and set
    // go to ---> Code ---> generate, contructor, get and set,
    // Or press the keyboards Alt + Insert

    public ClothingItem(String size, String type, double price, int quantity) {
        this.size = size;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
