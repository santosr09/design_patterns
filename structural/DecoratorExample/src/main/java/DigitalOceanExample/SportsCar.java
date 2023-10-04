package DigitalOceanExample;

/**
 * Concrete decorator, extending the base decorator functionality and modifying the component behavior accordingly.
 */

public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    public void assemble() {
        super.assemble();
        System.out.println(" Adding features of Sports car.");
    }
}
