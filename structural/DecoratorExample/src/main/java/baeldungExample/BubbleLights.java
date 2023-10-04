package baeldungExample;

/**
 * This is another type of decorating element, is extending the abstract TreeDecorator class and
 * modifying its decorate() method according to our requirement.
 */

public class BubbleLights extends TreeDecorator {

    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLigths();
    }

    private String decorateWithBubbleLigths() {
        return " with Bubble Lights";
    }
}
