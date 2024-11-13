package pl.vistula;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("GLE","Mercedes", 2020, 350_000, "white",5);
        Car car2 = new Car("GLC","Mercedes", 2023, 200_000, "silver", 3);

        out.println(car1);
        out.println(car2);
        out.println(car1.getColor());

        out.println("Are these objects equal? " + car1.equals(car2));
        out.println("Hashcode car1 is : " + car1.hashCode());
        out.println("Hashcode car2 is : " + car2.hashCode());
        out.println("Hashcode are equals: " + (car2.hashCode() == car1.hashCode()));

        car1.sell(10);

        out.println(car1.getModel());
        out.println(car1.getBrand());
        out.println(car1.getPrice());
        out.println(car1.getColor());
        out.println(car1.getSum());

        car1.setColor("black");
        car1.setPrice(70000);
        car1.delivery(100);

        out.println(car1);
    }
}