package LAB7;

public class car {
    //attributes
    private String id;
    private String color;
    private String brand;
    //constructors
    public car() {

    }

    public car(String id, String color, String brand) {
        this.id = id;
        this.color = color;
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "car{" +
                "id='" + id + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
