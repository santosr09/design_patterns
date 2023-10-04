package baeldungExample;

/**
 * A Decorator pattern can be used to attach additional responsibilities to an object statically or dynamically.
 * We have a ChristmasTree we cant to decorate without change the object, just adding some decorations.
 */

public abstract class TreeDecorator implements ChristmasTree{
    private ChristmasTree tree;

    public TreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }

    @Override
    public String decorate() {
        return tree.decorate();
    }
}
