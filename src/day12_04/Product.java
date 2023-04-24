package day12_04;

public class Product {
    private static int idUpProduct = 1;
    private int id;
    private String name;
    private double price;
    private String des;
    private Brand brand;

    public Product() {
        this.id = idUpProduct++;
    }

    public Product(String name, double price, String des, Brand brand) {
        this.id = idUpProduct++;
        this.name = name;
        this.price = price;
        this.des = des;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", des='" + des + '\'' +
                ", brand=" + brand ;
    }
}
