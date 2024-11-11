package pl.vistula;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("GLE","Mercedes", "red", 80000, 50);
        Car car2 = new Car("GLC","Mercedes", "red", 80000, 50);

        out.println("Are these objects equal? " + car1.equals(car2));
        out.println("Hashcode car1 is : " + car1.hashCode());
        out.println("Hashcode car2 is : " + car2.hashCode());
        out.println(car1);

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