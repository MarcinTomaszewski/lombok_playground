package pl.vistula;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String model;
    private String brand;
    private String color;
    private int price;
    private int sum;

    public void delivery(int sum) {
        this.sum += sum;
    }

    public void sell(int sum) {
        this.sum -= sum;
    }
}
