package pl.vistula;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Berlingo","Citroen", 80000, "red", 50);
        out.println(car);

        car.sell(10);

        out.println(car.getModel());
        out.println(car.getBrand());
        out.println(car.getPrice());
        out.println(car.getColor());
        out.println(car.getSum());

        car.setColor("black");
        car.setPrice(70000);
        car.delivery(100);

        out.println(car);
    }
}