package DigitalOceanExample;

/**
 * Component implementation, the basic implementation of the component interface.
 *
 * There might be several variations of these classes in a program.
 *
 */

public class BasicCar implements Car{

    @Override
    public void assemble() {
        System.out.println("Basic car.");
    }
}
