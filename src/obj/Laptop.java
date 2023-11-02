package obj;

public class Laptop {
    private int ID;
    private double price;
    private int yearOfProduct;
    private String color;
    private String brand;

    public Laptop(int ID, double price, int yearOfProduct, String color, String brand) {
        this.ID = ID;
        this.price = price;
        this.yearOfProduct = yearOfProduct;
        this.color = color;
        this.brand = brand;
    }

    public int getID() {
        return ID;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfProduct() {
        return yearOfProduct;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYearOfProduct(int yearOfProduct) {
        this.yearOfProduct = yearOfProduct;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
