package pl.vistula;

public class Car {
    private String model;
    private String brand;
    private String color;
    private int price;
    private int sum;

    public Car(String model, String brand, int price, String color, int sum) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.sum = sum;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }
    public String getColor() {
        return color;
    }
    public int getPrice() {
        return price;
    }

    public int getSum() {
        return sum;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", sum=" + sum +
                '}';
    }

    public void delivery(int sum) {
        this.sum += sum;
    }

    public void sell(int sum) {
        this.sum -= sum;
    }
}
