package DigitalOceanExample;

/**
 * The client program can create different kinds of Object at runtime, and they can specify the order execution too.
 */

public class DecoratorTest {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
