package baeldungExample;

/**
 * This is the implementation of the object that will be decorated
 *
 * It defines the basic behavior, which can be altered by decorators.
 *
 * There might be several variations of these classes in a program.
 *
 */

public class ChristmasTreeImpl implements ChristmasTree{
    @Override
    public String decorate() {
        return "Christmas tree";
    }
}
