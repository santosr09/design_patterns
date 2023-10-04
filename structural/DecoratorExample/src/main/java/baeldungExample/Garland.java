package baeldungExample;

/**
 * This is a type of decorating element, this decorator is extending the abstract TreeDecorator class and
 * will modify its decorate() method according to our requirement.
 */

public class Garland extends TreeDecorator {
    public Garland(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }

    private String decorateWithGarland() {
        return " with Garland";
    }
}
