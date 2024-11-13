package pl.vistula;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
public class Car {
    private String model;
    @EqualsAndHashCode.Include private String brand;
    private int year;
    private int price;
    private String color;
    private int sum;

    public void delivery(int sum) {
        this.sum += sum;
    }

    public void sell(int sum) {
        this.sum -= sum;
    }
}
