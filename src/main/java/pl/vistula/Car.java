package pl.vistula;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && sum == car.sum && Objects.equals(model, car.model) && Objects.equals(brand, car.brand) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, brand, color, price, sum);
    }

    public void delivery(int sum) {
        this.sum += sum;
    }

    public void sell(int sum) {
        this.sum -= sum;
    }
}
